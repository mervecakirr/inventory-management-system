package com.merve.inventory.demo;

import com.merve.inventory.service.StockService;
import com.merve.inventory.strategy.FIFOStrategy;
//import com.merve.inventory.strategy.LIFOStrategy;
//import com.merve.inventory.strategy.WeightedAverageStrategy;

import com.merve.inventory.builder.ProductBuilder;
import com.merve.inventory.model.entity.Category;
import com.merve.inventory.model.entity.Product;
import com.merve.inventory.model.entity.StockMovement;
import com.merve.inventory.model.entity.Supplier;
import com.merve.inventory.model.entity.Warehouse;
import com.merve.inventory.model.enums.ProductType;

import com.merve.inventory.model.enums.MovementType;
import com.merve.inventory.strategy.LIFOStrategy;
import com.merve.inventory.strategy.WeightedAverageStrategy;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;

public class StrategyDemo {

    public static void main(String[] args) {

     /*   StockService stockService = new StockService(new FIFOStrategy());

        stockService.setStrategy(new LIFOStrategy());

        stockService.setStrategy(new WeightedAverageStrategy());

        System.out.println("Strategy Pattern configured successfully.");
*/


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

        Product product = new ProductBuilder()
                .id(1L)
                .name("MacBook Pro")
                .barcode("MBP001")
                .price(95000)
                .stockQuantity(230)
                .category(category)
                .supplier(supplier)
                .warehouse(warehouse)
                .build(ProductType.ELECTRONIC);

        List<StockMovement> movements = new ArrayList<>();

        movements.add(
                new StockMovement(
                        1L,
                        product,
                        100,
                        50,
                        MovementType.PURCHASE,
                        LocalDate.of(2026, 1, 1)
                )
        );

        movements.add(
                new StockMovement(
                        2L,
                        product,
                        50,
                        60,
                        MovementType.PURCHASE,
                        LocalDate.of(2026, 1, 5)
                )
        );

        movements.add(
                new StockMovement(
                        3L,
                        product,
                        80,
                        70,
                        MovementType.PURCHASE,
                        LocalDate.of(2026, 1, 8)
                )
        );

        StockService service = new StockService(new FIFOStrategy());

        double fifoCost = service.calculateCost(movements, 120);

        System.out.println("FIFO Cost : " + fifoCost);


        service.setStrategy(new LIFOStrategy());

        double lifoCost = service.calculateCost(movements, 120);

        System.out.println("LIFO Cost : " + lifoCost);


        service.setStrategy(new WeightedAverageStrategy());

        double weightedCost = service.calculateCost(movements, 120);

        System.out.println("Weighted Average Cost : " + weightedCost);
    }
}