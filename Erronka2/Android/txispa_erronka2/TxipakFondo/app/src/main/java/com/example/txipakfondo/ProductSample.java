package com.example.txipakfondo;

public class ProductSample {
    private int id;
    private String name;
    private double price;
    private double qty;
    private String desk;
    private String category;



    public ProductSample(int id, String name, double price, double qty, String desk, String category) {
        this.id = id;
        this.name = name;
        this.price=price;
        this.qty=qty;
        this.desk = desk;
        this.category = category;
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

    public String getDesk() {
        return desk;
    }

    public void setDesk(String desk) {
        this.desk = desk;
    }

    public String getCategory() { return category; }

    public void setCategory(String kategory) { this.category = kategory; }

    @Override
    public String toString() {
        return "ProductSample{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", qty=" + qty +
                ", desk='" + desk + '\'' +
                ", kategory='" + category + '\'' +
                '}';
    }
}
