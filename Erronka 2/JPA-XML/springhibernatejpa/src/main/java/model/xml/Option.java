package model.xml;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "Option")
public class Option {

    String date;
    int qty;
    String name;
    

    public String getDate() {
    	return date;
    }
    @XmlAttribute
    public void setDate(String date) {
    	this.date = date;
    }
    
	public int getQty() {
		return qty;
	}
	
	@XmlElement(name = "Sartutako_elementuak")
	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getName() {
		return name;
	}
	
	@XmlElement(name = "Izena")
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Option Date: "+ date +"[Sartutako elementuak=" + qty + ", name=" + name + "]";
	}

    
}
