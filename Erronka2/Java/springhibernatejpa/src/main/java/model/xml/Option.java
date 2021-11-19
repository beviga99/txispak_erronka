package model.xml;

<<<<<<< HEAD
import javax.xml.bind.annotation.XmlAccessorType;
=======
>>>>>>> 524d3f839f2cfaf775fd5d1e35f18b8db78350e4
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "Option")
public class Option {

    String date;
<<<<<<< HEAD
    int qty;
=======
    int option;
    public int getOption() {
		return option;
	}
	public void setOption(int option) {
		this.option = option;
	}

	int qty;
>>>>>>> 524d3f839f2cfaf775fd5d1e35f18b8db78350e4
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
	
<<<<<<< HEAD
	@XmlElement(name = "Izena")
=======
	@XmlElement(name = "Taulen_Izena")
>>>>>>> 524d3f839f2cfaf775fd5d1e35f18b8db78350e4
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
<<<<<<< HEAD
		return "Option Date: "+ date +"[Sartutako elementuak=" + qty + ", name=" + name + "]";
=======
		return "Option Date: "+ date +"[Aukeratutako zenbakia=" + option + ", Sartutako elementuak=" + qty + ", name=" + name + "]";
>>>>>>> 524d3f839f2cfaf775fd5d1e35f18b8db78350e4
	}

    
}
