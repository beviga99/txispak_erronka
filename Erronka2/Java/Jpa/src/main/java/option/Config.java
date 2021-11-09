package option;



import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class Config {

    public static void optionBerria(String name, int qty) {

        JAXBContext jaxbContext = null;
        try {
        	
            jaxbContext = JAXBContext.newInstance(Option.class);

            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        	LocalDateTime now = LocalDateTime.now();
            
            Option o = new Option();
            o.setDate(now.toString());
            o.setQty(qty);
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
