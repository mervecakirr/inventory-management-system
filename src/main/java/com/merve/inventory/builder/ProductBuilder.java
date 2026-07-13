package com.merve.inventory.builder;

import com.merve.inventory.factory.DefaultProductFactory;
import com.merve.inventory.factory.ProductFactory;
import com.merve.inventory.model.entity.Category;
import com.merve.inventory.model.entity.Product;
import com.merve.inventory.model.entity.Supplier;
import com.merve.inventory.model.entity.Warehouse;
import com.merve.inventory.model.enums.ProductType;

public class ProductBuilder {

    private Long id;
    private String name;
    private String barcode;
    private double price;
    private int stockQuantity;

    private Category category;
    private Supplier supplier;
    private Warehouse warehouse;

    public ProductBuilder id(Long id) {
        this.id = id;
        return this;
    }

    public ProductBuilder name(String name) {
        this.name = name;
        return this;
    }

    public ProductBuilder barcode(String barcode) {
        this.barcode = barcode;
        return this;
    }

    public ProductBuilder price(double price) {
        this.price = price;
        return this;
    }

    public ProductBuilder stockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
        return this;
    }

    public ProductBuilder category(Category category) {
        this.category = category;
        return this;
    }

    public ProductBuilder supplier(Supplier supplier) {
        this.supplier = supplier;
        return this;
    }

    public ProductBuilder warehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
        return this;
    }

    public Product build(ProductType type) {

        ProductFactory factory = new DefaultProductFactory();

        Product product = factory.createProduct(
                type,
                id,
                name,
                barcode,
                price,
                stockQuantity
        );

        product.setCategory(category);
        product.setSupplier(supplier);
        product.setWarehouse(warehouse);

        return product;
    }
}