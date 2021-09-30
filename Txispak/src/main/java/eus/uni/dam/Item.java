package eus.uni.dam;

public class Item {
	private int id;
	private String name;
	private Double price;
	private Double qty;
	public Item(int id, String name,double price, double qty) {
		this.id = id;
		this.name = name;
		this.price=price;
		this.qty=qty;
		
	}
	
	public Item() {
		
	}
	
	
	public Double getQty() {
		return qty;
	}

	public void setQty(Double qty) {
		this.qty = qty;
	}

	public void setPrice(Double price) {
		this.price = price;
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
		return "Item [id=" + id + ", name=" + name + "price="+price+"qty="+qty+"]";
	}
	
	
	

}
