package com.merve.inventory.model.entity;

public class ElectronicProduct extends Product {

    public ElectronicProduct(Long id,
                             String name,
                             String barcode,
                             double price,
                             int stockQuantity) {
        super(id, name, barcode, price, stockQuantity);
    }

    @Override
    public String getProductType() {
        return "Electronic";
    }
}