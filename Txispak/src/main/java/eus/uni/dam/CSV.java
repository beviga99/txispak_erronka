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
			//File izena produktuak.csv
			String filename = "Produktuak.csv";
			// Array list bat non produktuak gordeko ditugun
			public ArrayList<Item> produktuak = new ArrayList<>();

			CSV() {

			};

			public Collection<Item> getItems() {
				return produktuak;
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
			 * Datu baseko produktuak bistaratu selectaren bidez.
			 * Datu basearekin konektatu , selekta egin, datu baseko produktuak produktu objetuan gorde eta arrayListara gehitu
			 */
			@PostConstruct
			public void init() {

				String sql = "select product_product.id , product_template.name, product_template.list_price , stock_quant.quantity , product_template.description,  product_category.name as c "
						+ "from product_product "
						+ "inner join product_template on product_product.id = product_template.id "
						+ "inner join stock_quant on product_product.id = stock_quant.product_id "
						+ "inner join product_category on product_template.categ_id =product_category.id "
						+ "where stock_quant.quantity>=0 "
						+ "order by product_product.id";
				

				try (Connection conn = connect();
						Statement stmt = conn.createStatement();
						ResultSet rs = stmt.executeQuery(sql)) {
					while (rs.next()) {
						Item m = new Item(rs.getInt("id"), rs.getString("name"), rs.getDouble("list_price"),rs.getInt("quantity"), rs.getString("description"),rs.getString("c"));
						produktuak.add(m);
					}
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, ex.getMessage());
				}

			}
			/**
			 * Filearen izena zehazten dugu eta non sortuko dugun -->url
			 * File bat sortuko dugu -->produktuak.csv
			 * FileWrite objetua sortu produktuak.csv idazteko -->Gure produktuak adibidez
			 * FileWrite arraylisteko poduktuak (Datu baseko produktuak) idatzi
			 */
			@PreDestroy
			public void destroy() {
				String filename = "C:/Users/tubia.ane/Desktop/Txispak/txispak_erronka/TxipakFondo/app/src/main/res/raw/produktuak.csv";

				try {
					File myObj = new File("produktuak.csv");
					myObj.createNewFile();
				} catch (IOException e) {
					System.out.println("An error occurred.");
					e.printStackTrace();
				}
				try {
					FileWriter writer = new FileWriter(filename);
					writer.write("ID; PRODUKTU; PREZIOA; KANTITATEA; DESKRIPZIOA \n");

					for (Item p : produktuak) {
						writer.write(p.getId() + ";" + p.getName() +";"+ p.getPrice() +";"+ p.getQty()+ ";"+ p.getDescript()+";"+ p.getCateg()+"\n");
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