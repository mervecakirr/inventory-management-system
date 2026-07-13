package com.merve.inventory.factory;

import com.merve.inventory.model.entity.ClothingProduct;
import com.merve.inventory.model.entity.ElectronicProduct;
import com.merve.inventory.model.entity.FoodProduct;
import com.merve.inventory.model.entity.Product;
import com.merve.inventory.model.enums.ProductType;

public class DefaultProductFactory implements ProductFactory {

    @Override
    public Product createProduct(
            ProductType type,
            Long id,
            String name,
            String barcode,
            double price,
            int stockQuantity) {

        return switch (type) {

            case ELECTRONIC ->
                    new ElectronicProduct(id, name, barcode, price, stockQuantity);

            case FOOD ->
                    new FoodProduct(id, name, barcode, price, stockQuantity);

            case CLOTHING ->
                    new ClothingProduct(id, name, barcode, price, stockQuantity);
        };
    }
}