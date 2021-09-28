package eus.uni.dam;



import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.JOptionPane;



public class Model {
	/**
	 * Datu basearekin konektatu
	 * @return konekzioa
	 */
	
    public static Connection connect() {
        Connection conn = null;
        try {
        	String url = "jdbc:postgresql://192.168.65.11/Admin";
        	Properties props = new Properties();
        	props.setProperty("user","openpg");
        	props.setProperty("password","openpgpwd");
        	conn = DriverManager.getConnection(url, props);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        } 
        
        return conn;
    
}
    public static ArrayList<Item> read() {
        ArrayList<Item> items = new ArrayList<>();
        String taula = "product_template";
        String sql = "SELECT id, name FROM " + taula;

        try (Connection conn = connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Item m= new Item(rs.getInt("id"),rs.getString("name"));
                items.add(m);
            }
        } catch (Exception ex) {
        }
        return items;
    }
	 
	 
	 
}

