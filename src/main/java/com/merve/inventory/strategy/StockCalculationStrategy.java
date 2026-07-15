package com.merve.inventory.strategy;

import com.merve.inventory.model.entity.StockMovement;

import java.util.List;

public interface StockCalculationStrategy {

    double calculateCost(List<StockMovement> movements,
                         int saleQuantity);

}