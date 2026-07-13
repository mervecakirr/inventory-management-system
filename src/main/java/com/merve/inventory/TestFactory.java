package com.merve.inventory;


import com.merve.inventory.factory.DefaultProductFactory;
import com.merve.inventory.factory.ProductFactory;
import com.merve.inventory.model.entity.Product;
import com.merve.inventory.model.enums.ProductType;

public class TestFactory {

    public static void main(String[] args) {

        ProductFactory factory = new DefaultProductFactory();

        Product phone = factory.createProduct(
                ProductType.ELECTRONIC,
                1L,
                "iPhone 16",
                "111111",
                80000,
                20
        );

        System.out.println(phone.getName());
        System.out.println(phone.getProductType());

    }

}