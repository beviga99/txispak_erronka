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
public class CSV implements ItemDao {

	String filename = "Produktuak.csv";
	public ArrayList<Item> produktuak = new ArrayList<>();

	CSV() {

	};

	public Collection<Item> getItems() {
		return produktuak;
	};

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

	@PostConstruct
	public void init() {
		String taula = "product_template";
		String sql = "SELECT id, name FROM " + taula;

		try (Connection conn = connect();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {
			while (rs.next()) {
				Item m = new Item(rs.getInt("id"), rs.getString("name"));
				produktuak.add(m);
			}
		} catch (Exception ex) {
		}

	}

	@PreDestroy
	public void destroy() {
		String filename = "C:\Users\tubia.ane\Desktop\Txispak\txispak_erronka/TxipakFondo/app/src/main/res/raw/produktuak.csv";

		try {
			File myObj = new File("Produktuak.csv");
			myObj.createNewFile();
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		try {
			FileWriter writer = new FileWriter(filename);
			writer.write("ID PRODUKTU ; DESKRIPZIOA \n");

			for (Item p : produktuak) {
				writer.write(p.getId() + ";" + p.getName() + ".\n");
			}

			writer.close();
			System.out.println("Successfully wrote to the file.");

		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	@Override
	public Collection<Item> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Item produktua) {
		// TODO Auto-generated method stub

	}

	@Override
	public void edit(Item produktua) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub

	}
}
