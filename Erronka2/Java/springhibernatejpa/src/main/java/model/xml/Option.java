package model.xml;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "Option")
public class Option {

    String date;
    int option;
    public int getOption() {
		return option;
	}
	public void setOption(int option) {
		this.option = option;
	}

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
	
	@XmlElement(name = "Taulen_Izena")
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Option Date: "+ date +"[Aukeratutako zenbakia=" + option + ", Sartutako elementuak=" + qty + ", name=" + name + "]";
	}

    
}