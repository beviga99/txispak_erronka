package com.example.login2;

import android.os.Message;
import android.text.Editable;
import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Konektatu {
    private  Connection connection;
    ArrayList<User>users=new ArrayList<>();


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
            thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
            this.status = false;
        }
    }
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

}
