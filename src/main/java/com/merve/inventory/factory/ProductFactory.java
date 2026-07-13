package com.merve.inventory.factory;

import com.merve.inventory.model.entity.Product;
import com.merve.inventory.model.enums.ProductType;

public interface ProductFactory {

    Product createProduct(
            ProductType type,
            Long id,
            String name,
            String barcode,
            double price,
            int stockQuantity
    );
}