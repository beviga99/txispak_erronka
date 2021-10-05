package eus.uni.dam;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
//		SpringApplication.run(Main.class, args);
		// TODO Auto-generated method stub
//		ArrayList<Item> item = Model.read();

//		CSV peliDao = appContext.getBean(CSV.class);
//		System.out.println(item.toString());

		((AnnotationConfigApplicationContext) appContext).close();
	}

}
