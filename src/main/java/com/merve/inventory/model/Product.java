package com.merve.inventory.model;

public abstract class Product {

    private Long id;
    private String name;
    private String barcode;
    private double price;
    private int stockQuantity;

    public Product() {
    }

    public Product(Long id, String name, String barcode, double price, int stockQuantity) {
        this.id = id;
        this.name = name;
        this.barcode = barcode;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public abstract String getProductType();

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBarcode() {
        return barcode;
    }

    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
}