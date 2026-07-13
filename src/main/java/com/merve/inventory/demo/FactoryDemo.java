package com.merve.inventory.demo;

import com.merve.inventory.factory.DefaultProductFactory;
import com.merve.inventory.factory.ProductFactory;
import com.merve.inventory.model.entity.Product;
import com.merve.inventory.model.enums.ProductType;

public class FactoryDemo {

    public static void main(String[] args) {

        ProductFactory factory = new DefaultProductFactory();

        Product laptop = factory.createProduct(
                ProductType.ELECTRONIC,
                1L,
                "MacBook Pro",
                "MBP001",
                95000,
                5
        );

        Product apple = factory.createProduct(
                ProductType.FOOD,
                2L,
                "Apple",
                "APL001",
                35,
                200
        );

        Product tshirt = factory.createProduct(
                ProductType.CLOTHING,
                3L,
                "Nike T-Shirt",
                "NK001",
                1500,
                40
        );

        System.out.println("==============");
        System.out.println(laptop.getName() + " -> " + laptop.getProductType());
        System.out.println(apple.getName() + " -> " + apple.getProductType());
        System.out.println(tshirt.getName() + " -> " + tshirt.getProductType());
        System.out.println("==============");
    }
}