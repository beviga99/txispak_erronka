package com.example.txipakfondo;

public class ProductSample {
    private int id;
    private String name;

    public ProductSample(int id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "Item [id=" + id + ", name=" + name + "]";
    }
}
