package eus.uni.dam;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
		// TODO Auto-generated method stub
		ArrayList<Item> item = Model.read();

		System.out.println(item.toString());
	}

}
