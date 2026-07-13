package com.merve.inventory.demo;

import com.merve.inventory.builder.ProductBuilder;
import com.merve.inventory.model.entity.Category;
import com.merve.inventory.model.entity.Product;
import com.merve.inventory.model.entity.Supplier;
import com.merve.inventory.model.entity.Warehouse;
import com.merve.inventory.model.enums.ProductType;

public class BuilderDemo {

    public static void main(String[] args) {

        Category category = new Category(1L, "Laptop");

        Supplier supplier = new Supplier(
                1L,
                "Apple Inc.",
                "apple@apple.com",
                "02121234567"
        );

        Warehouse warehouse = new Warehouse(
                1L,
                "Main Warehouse",
                "Kocaeli"
        );

        Product laptop = new ProductBuilder()
                .id(1L)
                .name("MacBook Pro")
                .barcode("MBP001")
                .price(95000)
                .stockQuantity(5)
                .category(category)
                .supplier(supplier)
                .warehouse(warehouse)
                .build(ProductType.ELECTRONIC);

        System.out.println("========== PRODUCT ==========");
        System.out.println("Name      : " + laptop.getName());
        System.out.println("Type      : " + laptop.getProductType());
        System.out.println("Category  : " + laptop.getCategory().getName());
        System.out.println("Supplier  : " + laptop.getSupplier().getCompanyName());
        System.out.println("Warehouse : " + laptop.getWarehouse().getName());
        System.out.println("=============================");
    }
}