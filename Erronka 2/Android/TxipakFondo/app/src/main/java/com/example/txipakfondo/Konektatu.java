package com.example.txipakfondo;

import android.util.Log;

import com.example.txipakfondo.ProductSample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.concurrent.Semaphore;

public class Konektatu {
    private Connection connection;

    public static ArrayList<ProductSample> selecta = new ArrayList<>();
    public static ArrayList<String> kategoriak = new ArrayList<>();
    public static ArrayList<String> bezeroak = new ArrayList<>();
    private int id;
    private Semaphore s1 = new Semaphore(1);

    // private final String host = "ssprojectinstance.csv2nbvvgbcb.us-east-2.rds.amazonaws.com"  // For Amazon Postgresql
    private final String host = "192.168.65.11";  // For Google Cloud Postgresql
    private final String database = "Admin";
    private final int port = 5432;
    private final String user = "openpg";
    private final String pass = "openpgpwd";
    private String url = "jdbc:postgresql://%s:%d/%s";
    private boolean status;

    public Konektatu() {
        this.url = String.format(this.url, this.host, this.port, this.database);
        connect();
    }

    public void connect() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    selecta = new ArrayList<>();
                    kategoriak = new ArrayList<>();
                    bezeroak = new ArrayList<>();
                    Class.forName("org.postgresql.Driver");
                    connection = DriverManager.getConnection(url, user, pass);
                    status = true;
                    System.out.println("connected:" + status);
                } catch (Exception e) {
                    status = false;
                    System.out.print(e.getMessage());
                    e.printStackTrace();
                }
            }
        });
        thread.start();

        try {
            thread.join();
        } catch (Exception e) {
            e.printStackTrace();
            this.status = false;
        }
    }

    public void select() {

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {

                    Class.forName("org.postgresql.Driver");

                    Statement stmt = connection.createStatement();

                    //Produktuak eta informazioa ikusteko.
                    ResultSet rs = stmt.executeQuery("select product_template.id, product_template.name, product_template.list_price, stock_quant.quantity, product_template.description, product_category.name as c "
                            + "from product_template "
                            + "inner join stock_quant on product_template.id = stock_quant.product_id "
                            + "inner join product_category on product_template.categ_id = product_category.id "
                            + "where stock_quant.location_id = 8 "
                            + "order by product_template.id;");



                    while (rs.next()) {

                        ProductSample p = new ProductSample(rs.getInt("id"), rs.getString("name"), rs.getDouble("list_price"), rs.getDouble("quantity"), rs.getString("description"), rs.getString("c"));

                        selecta.add(p);
                    }
                    //Produktuen kategoriak ikusteko.
                    ResultSet rs2 = stmt.executeQuery("SELECT name FROM product_category");

                    while (rs2.next()){
                        kategoriak.add(rs2.getString("name"));
                    }
                    //Bezeroak ikusteko.
                    ResultSet rs3 = stmt.executeQuery("select res_partner.name from res_partner " +
                            "inner join res_partner_res_partner_category_rel on res_partner_res_partner_category_rel.partner_id = res_partner.id " +
                            "where res_partner_res_partner_category_rel.category_id = 1;");

                    while (rs3.next()){
                        bezeroak.add(rs3.getString("name"));
                    }


                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });
        thread2.start();
        try {
            thread2.join();
            Thread.interrupted();
        } catch (Exception e) {
            e.printStackTrace();
            this.status = false;
        }

    }

    public int bezeroId(String name) {

        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {

                    String id2 = "";

                    Class.forName("org.postgresql.Driver");

                    Statement stmt = connection.createStatement();

                    ResultSet rs = stmt.executeQuery("select res_partner.id from res_partner " +
                            "where res_partner.name = '"+name+"';");

                    while (rs.next()){
                        id2 = rs.getString("id");
                    }

                    id = Integer.parseInt(id2);

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });

        thread4.start();
        try {
            thread4.join();
            Thread.interrupted();
        } catch (Exception e) {
            e.printStackTrace();
            this.status = false;
        }

        return id;

    }
    
    public void insert(ProductSample p, int bezeroa, int cant, double price) {
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {

                    s1.acquire();

                    Class.forName("org.postgresql.Driver");

                     try {
                         Statement stmt = connection.createStatement();

                         ResultSet rs = stmt.executeQuery("SELECT MAX(id) as order_id from sale_order;");

                         int last_order = 0;

                         while (rs.next()) {
                             last_order = rs.getInt("order_id");
                         }

                         last_order = last_order + 1;

                         Double amount = price * cant;

                         ResultSet rs2 = stmt.executeQuery("INSERT INTO public.sale_order (name, date_order, user_id, partner_id, partner_invoice_id, partner_shipping_id, pricelist_id, company_id, picking_policy, warehouse_id, amount_total, state) " +
                                 "VALUES('SM00" + last_order + "', '2021-10-25 06:22:23.000', 7, " + bezeroa + ", " + bezeroa + ", " + bezeroa + ", 1, 1, 'direct', 1, " + amount + ", 'draft');");


                     }finally{
                        // calling release() after a successful acquire()
                        System.out.println("baimena askatzen...");
                        s1.release();
                        System.out.println("eskuragarri dauden Semaforoak orain bertan: " + s1.availablePermits());
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread5 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {

                    s1.acquire();

                    Class.forName("org.postgresql.Driver");

                    select();

                    try {
                        Statement stmt = connection.createStatement();

                        ResultSet rs = stmt.executeQuery("SELECT MAX(id) as order_id from sale_order;");

                        int last_order = 0;

                        while (rs.next()){
                            last_order = rs.getInt("order_id");
                        }

                        ResultSet rs3 = stmt.executeQuery("INSERT INTO public.sale_order_line (order_id, name, sequence, invoice_status, price_unit, price_subtotal, price_tax, price_total, product_id, product_uom_qty, product_uom, qty_delivered_method, salesman_id, currency_id, company_id, order_partner_id, state, customer_lead, create_uid, write_uid) " +
                                "VALUES(" + last_order + ", '" + p.getName() + "', 10, 'no', " + price + ", " + price + ", 4.81, " + price + ", " + p.getId() + ", " + cant + ", 1, 'stock_move', 7, 1, 1, 14, 'draft', 0, 7, 7);");

                    } finally {
                        s1.release();
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        thread3.setPriority(10);
        thread5.setPriority(1);
        thread3.start();
        thread5.start();

    }

}