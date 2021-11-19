package eus.uni.dam;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Properties;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.swing.JOptionPane;

import org.springframework.stereotype.Repository;

@Repository
public class CSVkat implements CategoryDao {
	//File izena produktuak.csv
	String filename = "Kategoria.csv";
	// Array list bat non kategoriak gordeko ditugun
	public ArrayList<Category> kategoriak = new ArrayList<>();

	CSVkat() {

	};

	public Collection<Category> getCategory() {
		return kategoriak;
	};
	/**
	 * Datu basearekin konektatzeko
	 * @return konekzioa
	 */
	public static Connection connect() {
		Connection conn = null;
		try {
			String url = "jdbc:postgresql://192.168.65.11/Admin";
			Properties props = new Properties();
			props.setProperty("user", "openpg");
			props.setProperty("password", "openpgpwd");
			conn = DriverManager.getConnection(url, props);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}

		return conn;

	}
	/**
	 * Datu baseko kategoriak bistaratu selectaren bidez.
	 * Datu basearekin konektatu , selekta egin, datu baseko kategoriak kategoria objetuan gorde eta arrayListara gehitu
	 */
	@PostConstruct
	public void init() {

		String sql = "SELECT name FROM product_category";
		

		try (Connection conn = connect();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {
			while (rs.next()) {
				Category c = new Category(rs.getString("name"));
				kategoriak.add(c);
			}
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage());
		}

	}
	/**
	 * Filearen izena zehazten dugu eta non sortuko dugun -->url
	 * File bat sortuko dugu -->kategoria.csv
	 * FileWrite objetua sortu kategoria.csv idazteko -->Gure kategoriak adibidez
	 * FileWrite arraylisteko kategoriak (Datu baseko produktuak) idatzi
	 */
	@PreDestroy
	public void destroy() {
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 524d3f839f2cfaf775fd5d1e35f18b8db78350e4
		String filename = "C:/Users/tubia.ane/Desktop/Txispak/txispak_erronka/TxipakFondo/app/src/main/res/raw/kategoria.csv";

		try {
			File myObj = new File("kategoria.csv");
			myObj.createNewFile();
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
<<<<<<< HEAD
=======
		String filename = "C:\\Users\\arambarri.oihana\\Desktop\\txispakOndo\\txispak_erronka\\TxipakFondo\\app\\src\\main\\res\\raw\\kategoria.csv";

		
>>>>>>> 2536df587d13dd35d3ef8d9ffe52a3e20af66781
=======
>>>>>>> 524d3f839f2cfaf775fd5d1e35f18b8db78350e4
		try {
			FileWriter writer = new FileWriter(filename);
			writer.write("IZENA \n");

			for (Category p : kategoriak) {
				writer.write( p.getName()+"\n");
			}

			writer.close();
			System.out.println("Successfully wrote to the file.");

		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	@Override
	public Collection<Category> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Category kategoria) {
		// TODO Auto-generated method stub

	}

	@Override
	public void edit(Category kategoria) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub

	}
}
