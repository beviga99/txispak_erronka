package unieibar;

import java.io.IOException;

public class Firefox {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Process p1;
		ProcessBuilder pbuilder1;
		
		pbuilder1 = new ProcessBuilder("C:\\Program Files\\Mozilla Firefox\\firefox.exe",  "http://192.168.65.11:8069/");
		
		p1 = pbuilder1.start();
		
	}

}
