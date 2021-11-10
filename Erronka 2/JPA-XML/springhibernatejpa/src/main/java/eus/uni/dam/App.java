package eus.uni.dam;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import model.postgre.ProductTemplate;
import model.postgre.ResPartner;
import model.postgre.SaleOrderLine;
import model.sqlserver.Bezeroak;
import model.sqlserver.Produktoak;
import model.sqlserver.Salmentak;
import model.xml.Config;
import postgre.dao.PostDao;
import sql.dao.SqlDao;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(PostgreKonfiguration.class);
		ApplicationContext appContext2 = new AnnotationConfigApplicationContext(SqlKonfiguration.class);
	
		PostDao pd = appContext.getBean(PostDao.class);
		SqlDao sd = appContext2.getBean(SqlDao.class);
		
		Config conf = new Config();
		
		int bool = 0;
			
		List <ProductTemplate>produktuak = pd.getAllP();
		Produktoak produktua = new Produktoak();
		
		List <ResPartner>partners = pd.getAllPar();
		Bezeroak partner = new Bezeroak();
		
		List <SaleOrderLine>sales = pd.getAllSale();
		Salmentak salmenta = new Salmentak();

		while(bool == 0) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("-------------MENU NAGUSIA-------------");
		System.out.println("1- Exportatu bezeroak.");
		System.out.println("2- Exportatu produktuak.");
		System.out.println("3- Exportatu salmentak.");
		System.out.println("4- Exportatu dena.");
		System.out.println("5- options.xml irakurri.");
		System.out.println("0- Exit.");
		
		int aukera = in.nextInt();
		int x;
		
		switch(aukera){
		
			case 0:
				
				System.out.println("Agur!!!");
				bool = 1;
				break;
				
			case 1:
				
				x = 0;
				for (ResPartner b : partners) {
					System.out.println(b.getName());
					
					partner.setId(b.getId());
					partner.setName(b.getName());
					sd.updateBz(partner);
					x++;
				}
				
				conf.optionBerria("Bezeroak", x);
				break;
				
			case 2:
				
				x = 0;
				
				for (ProductTemplate p : produktuak) {
					System.out.println(p.getName());
					
					produktua.setId(p.getId());
					produktua.setName(p.getName());
					sd.updatePd(produktua);
				}
				
				conf.optionBerria("Produktuak", x);
				break;
				
			case 3:
				x = 0;
				
				for (SaleOrderLine b : sales) {
					System.out.println(b.getName());
					
					salmenta.setId(b.getId());
					
					ProductTemplate p1 = b.getProductTemplate();
					Produktoak pro = new Produktoak();
					
					pro.setId(p1.getId());
					pro.setName(p1.getName());
					
					salmenta.setP_id(pro);
					
					ResPartner parner = b.getResPartner();
					Bezeroak bezero = new Bezeroak();
					
					bezero.setId(parner.getId());
					bezero.setName(parner.getName());
					
					salmenta.setB_id(bezero);
					
					salmenta.setQty(b.getProductUomQty());
					
					salmenta.setTotal(b.getPriceTotal());
					
					sd.updateSal(salmenta);
					
					x++;
				}
				
				conf.optionBerria("Salmentak", x);
				break;
				
			case 4:
				x = 0;
				
				for (ProductTemplate p : produktuak) {
					System.out.println(p.getName());
					
					produktua.setId(p.getId());
					produktua.setName(p.getName());
					sd.updatePd(produktua);
					x++;
				}
				
				for (ResPartner b : partners) {
					System.out.println(b.getName());
					
					partner.setId(b.getId());
					partner.setName(b.getName());
					sd.updateBz(partner);
					x++;
				}
				
				for (SaleOrderLine b : sales) {
					System.out.println(b.getName());
					
					salmenta.setId(b.getId());
					
					ProductTemplate p1 = b.getProductTemplate();
					Produktoak pro = new Produktoak();
					
					pro.setId(p1.getId());
					pro.setName(p1.getName());
					
					salmenta.setP_id(pro);
					
					ResPartner parner = b.getResPartner();
					Bezeroak bezero = new Bezeroak();
					
					bezero.setId(parner.getId());
					bezero.setName(parner.getName());
					
					salmenta.setB_id(bezero);
					
					salmenta.setQty(b.getProductUomQty());
					
					salmenta.setTotal(b.getPriceTotal());
					
					sd.updateSal(salmenta);
					
					x++;
				}
				
				conf.optionBerria("Dena", x);
				break;
			
			case 5:
				
				conf.irakurriXML();
			
			default:
				
			System.out.println("Ez duzu ondo aukeratu.");
				
		}
		}
		((AnnotationConfigApplicationContext) appContext).close();
		((AnnotationConfigApplicationContext) appContext2).close();
		
	}

}
	
