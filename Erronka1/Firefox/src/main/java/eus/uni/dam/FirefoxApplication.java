package eus.uni.dam;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirefoxApplication {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Process p1;
		ProcessBuilder pbuilder1;
		
		Process p2;
		ProcessBuilder pbuilder2;
		
<<<<<<< HEAD
		pbuilder1 = new ProcessBuilder("C:\\Program Files\\Mozilla Firefox\\firefox.exe",  "http://192.168.65.11:8069/shop");
		
//		pbuilder2 = new ProcessBuilder("java", "-jar", "C:\\Users\\tubia.ane\\Desktop\\Txispak\\txispak_erronka\\Txispak\\target\\txispak.jar");
		
		p1 = pbuilder1.start();
		
//		p2 = pbuilder2.start();
=======
		pbuilder1 = new ProcessBuilder("C:\\Program Files\\Mozilla Firefox\\firefox.exe",  "http://192.168.65.11:8069/");
		
		pbuilder2 = new ProcessBuilder("java", "-jar", "C:\\Users\\arambarri.oihana\\Desktop\\txispakOndo\\txispak_erronka\\Txispak\\target\\txispak.jar");
		
		p1 = pbuilder1.start();
		
		p2 = pbuilder2.start();
>>>>>>> 2536df587d13dd35d3ef8d9ffe52a3e20af66781
		
	}


}
