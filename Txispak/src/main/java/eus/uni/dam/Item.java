package eus.uni.dam;

public class Item {
	private int id;
	private String name;
	private double price;
	private int qty;
	private String descript;
	private String categ;
	public Item(int id, String name,double price, int qty, String descript, String categ) {
		this.id = id;
		this.name = name;
		this.price=price;
		this.qty=qty;
		this.descript=descript;
		this.categ=categ;
	}
	
	public Item() {
		
	}
	
	
	public String getDescript() {
		return descript;
	}

	public void setDescript(String descript) {
		this.descript = descript;
	}

	

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}



	public String getCateg() {
		return categ;
	}

	public void setCateg(String categ) {
		this.categ = categ;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + "price="+price+"qty="+qty+"descript="+descript+"categ="+categ+"]";
	}
	
	
	

}
