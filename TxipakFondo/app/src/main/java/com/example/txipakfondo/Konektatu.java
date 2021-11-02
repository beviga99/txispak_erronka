package com.example.txipakfondo;

<<<<<<< HEAD
import android.util.Log;

import com.example.txipakfondo.ProductSample;

=======
import android.media.MediaCodec;
import android.util.Log;

import java.security.CryptoPrimitive;
>>>>>>> 2536df587d13dd35d3ef8d9ffe52a3e20af66781
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
<<<<<<< HEAD

public class Konektatu {
    private Connection connection;
    ArrayList<User>users=new ArrayList<>();

    public static ArrayList<ProductSample> selecta = new ArrayList<>();
    public static ArrayList<String> kategoriak = new ArrayList<>();

    private final String host = "192.168.65.11";
=======
import java.*;

public class Konektatu {
    private Connection connection;

    public static ArrayList<ProductSample> selecta = new ArrayList<>();
    public static ArrayList<String> kategoriak = new ArrayList<>();
    public static ArrayList<Login> loginak = new ArrayList<>();

    // private final String host = "ssprojectinstance.csv2nbvvgbcb.us-east-2.rds.amazonaws.com"  // For Amazon Postgresql
    private final String host = "192.168.65.11";  // For Google Cloud Postgresql
>>>>>>> 2536df587d13dd35d3ef8d9ffe52a3e20af66781
    private final String database = "Admin";
    private final int port = 5432;
    private final String user = "openpg";
    private final String pass = "openpgpwd";
    private String url = "jdbc:postgresql://%s:%d/%s";
    private boolean status;

    public Konektatu() {
        this.url = String.format(this.url, this.host, this.port, this.database);
        connect();
        //this.disconnect();
        System.out.println("connection status:" + status);
    }

    private void connect() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Class.forName("org.postgresql.Driver");
                    connection = DriverManager.getConnection(url, user, pass);
                    status = true;
                    System.out.println("connected:" + status);
                    select();
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
<<<<<<< HEAD
//            thread.sleep(1000);
=======
            thread.sleep(3000);
>>>>>>> 2536df587d13dd35d3ef8d9ffe52a3e20af66781
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

                    ResultSet rs = stmt.executeQuery("select product_template.id, product_template.name, product_template.list_price, stock_quant.quantity, product_template.description, product_category.name as c "
                            + "from product_template "
                            + "inner join stock_quant on product_template.id = stock_quant.product_id "
                            + "inner join product_category on product_template.categ_id = product_category.id "
                            + "where stock_quant.location_id = 8 "
                            + "order by product_template.id;");
<<<<<<< HEAD



=======
>>>>>>> 2536df587d13dd35d3ef8d9ffe52a3e20af66781
                    while (rs.next()) {

                        ProductSample p = new ProductSample(rs.getInt("id"), rs.getString("name"), rs.getDouble("list_price"), rs.getDouble("quantity"), rs.getString("description"), rs.getString("c"));

                        selecta.add(p);
                    }
                    ResultSet rs2 = stmt.executeQuery("SELECT name FROM product_category");

                    while (rs2.next()){
                        kategoriak.add(rs2.getString("name"));
                    }
<<<<<<< HEAD

=======
>>>>>>> 2536df587d13dd35d3ef8d9ffe52a3e20af66781
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
<<<<<<< HEAD

=======
>>>>>>> 2536df587d13dd35d3ef8d9ffe52a3e20af66781
    public void login( String  user,  String pass) {
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Statement sentencia = connection.createStatement();
                    ResultSet rs=sentencia.executeQuery("SELECT login, pass FROM login WHERE login= '"+user+"' AND pass= '"+pass+"'");
                    while(rs.next()) {
                        User u= new User(rs.getString("login"),rs.getString("pass"));
                        users.add(u);

                        Log.d("kaixo", "egin du");
                    }
                    Log.d("kaixo", " ez egin du");

                }catch (Exception e) {
                    e.printStackTrace();

                }
            }
        });

        thread3.start();
        try {
            thread3.join();
            Thread.interrupted();
        } catch (Exception e) {
            e.printStackTrace();
            status = false;
        }

    }
<<<<<<< HEAD


=======
>>>>>>> 2536df587d13dd35d3ef8d9ffe52a3e20af66781
}