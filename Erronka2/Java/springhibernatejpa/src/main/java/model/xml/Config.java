package model.xml;



import java.io.File;
import java.time.LocalDateTime;
<<<<<<< HEAD
import java.time.format.DateTimeFormatter;
=======
>>>>>>> 524d3f839f2cfaf775fd5d1e35f18b8db78350e4

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class Config {

<<<<<<< HEAD
    public static void optionBerria(String name, int qty) {
=======
    public static void optionBerria(String name, int qty, int option) {
>>>>>>> 524d3f839f2cfaf775fd5d1e35f18b8db78350e4

        JAXBContext jaxbContext = null;
        try {
        	
            jaxbContext = JAXBContext.newInstance(Option.class);

            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

<<<<<<< HEAD
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
=======
>>>>>>> 524d3f839f2cfaf775fd5d1e35f18b8db78350e4
        	LocalDateTime now = LocalDateTime.now();
            
            Option o = new Option();
            o.setDate(now.toString());
            o.setQty(qty);
<<<<<<< HEAD
=======
            o.setOption(option);
>>>>>>> 524d3f839f2cfaf775fd5d1e35f18b8db78350e4
            o.setName(name);
            
            jaxbMarshaller.marshal(o, new File("options.xml"));

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }
    
    public static void irakurriXML() {

        JAXBContext jaxbContext = null;
        try {
        	
            jaxbContext = JAXBContext.newInstance(Option.class);

            File file = new File("options.xml");

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            Option o = (Option) jaxbUnmarshaller.unmarshal(file);

            System.out.println(o);

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }

}
