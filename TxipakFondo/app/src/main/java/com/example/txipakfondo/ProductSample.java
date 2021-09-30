package com.example.txipakfondo;

public class ProductSample {
    private int id;
    private String name;
    private double price;
    private double qty;


    public ProductSample(int id, String name, double price, double qty) {
        this.id = id;
        this.name = name;
        this.price=price;
        this.qty=qty;
    }

    public ProductSample() {
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Item [id=" + id + ", name=" + name + "price="+price+ "qty="+qty+"]";
    }
}
