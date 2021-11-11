package eus.uni.dam;

import java.util.List;
import java.util.Scanner;

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
		
		int bool = 0;
		
		int x;
		
		int y;
			
		List <ProductTemplate>produktuak = pd.getAllP();
		
		List <ResPartner>partners = pd.getAllPar();
		
		List <SaleOrderLine>sales = pd.getAllSale();

		while(bool == 0) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("-------------MENU NAGUSIA-------------");
		System.out.println("1- Exportatu bezeroak.");
		System.out.println("2- Exportatu produktuak.");
		System.out.println("3- Exportatu salmentak.");
		System.out.println("4- Exportatu dena.");
		System.out.println("5- options.xml irakurri.");
		System.out.println("0- Exit.");
		System.out.print("Egin zure aukera: ");
		
		int aukera = in.nextInt();
		
		switch(aukera){
		
			case 0:
				
				System.out.println("Agur!!!");
				in.close();
				bool = 1;
				break;
				
			case 1:
				
				x = 0;
				y = bBerria(partners, sd, x);				
				Config.optionBerria("Bezeroak", y);
				break;
				
			case 2:
				x = 0;
				y = pBerria(produktuak, sd, x);
				Config.optionBerria("Produktuak", y);
				break;
				
			case 3:
				x = 0;
				y = sBerria(sales, sd, x);
				Config.optionBerria("Salmentak", y);
				break;
				
			case 4:
				x = 0;
				y = bBerria(partners, sd, x);
				y = y + pBerria(produktuak, sd, x);
				y = y + sBerria(sales, sd, x);
				Config.optionBerria("Dena", y);
				break;
			
			case 5:
				
				Config.irakurriXML();
			
			default:
				
			System.out.println("Ez duzu ondo aukeratu.");
				
		}
		}
		((AnnotationConfigApplicationContext) appContext).close();
		((AnnotationConfigApplicationContext) appContext2).close();
		
	}
	
	public static int pBerria(List <ProductTemplate>produktuak, SqlDao sd, int x) {
					
		Produktoak produktua = new Produktoak();
		
		for (ProductTemplate p : produktuak) {
			System.out.println(p.getName());
			
			produktua.setId(p.getId());
			produktua.setName(p.getName());
			sd.updatePd(produktua);
			
			x++;
		}
		
		return x;
		
	}
	
	public static int bBerria(List <ResPartner>partnere, SqlDao sd, int x) {
		

		Bezeroak partner = new Bezeroak();
		
		for (ResPartner b : partnere) {
			System.out.println(b.getName());
			
			partner.setId(b.getId());
			partner.setName(b.getName());
			sd.updateBz(partner);
			x++;
		}
		
		return x;
		
	}
	
	public static int sBerria(List <SaleOrderLine>sales, SqlDao sd, int x) {

		Salmentak salmenta = new Salmentak();
		
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
		
		return x;
		
	}

}
	
