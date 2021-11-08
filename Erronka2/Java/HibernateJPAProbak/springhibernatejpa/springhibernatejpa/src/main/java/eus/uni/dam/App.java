package eus.uni.dam;

import java.util.List;

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
import postgre.dao.PostDao;
import sql.dao.SqlDao;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(PostgreKonfiguration.class);
		ApplicationContext appContext2 = new AnnotationConfigApplicationContext(SqlKonfiguration.class);
	
		PostDao pd = appContext.getBean(PostDao.class);
		SqlDao sd = appContext2.getBean(SqlDao.class);
			
		List <ProductTemplate>produktuak = pd.getAllP();
		Produktoak produktua = new Produktoak();
		
		List <ResPartner>partners = pd.getAllPar();
		Bezeroak partner = new Bezeroak();
		
		List <SaleOrderLine>sales = pd.getAllSale();
		Salmentak salmenta = new Salmentak();

		
		for (ProductTemplate p : produktuak) {
			System.out.println(p.getName());
			
			produktua.setId(p.getId());
			produktua.setName(p.getName());
			sd.updatePd(produktua);
		}
		
		for (ResPartner b : partners) {
			System.out.println(b.getName());
			
			partner.setId(b.getId());
			partner.setName(b.getName());
			sd.updateBz(partner);
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
			
			sd.updateSal(salmenta);
		}
		
		 

		((AnnotationConfigApplicationContext) appContext).close();
		((AnnotationConfigApplicationContext) appContext2).close();

	}

}
