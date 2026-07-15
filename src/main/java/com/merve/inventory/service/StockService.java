package com.merve.inventory.service;

import com.merve.inventory.model.entity.StockMovement;
import com.merve.inventory.strategy.StockCalculationStrategy;

import java.util.List;

public class StockService {

    private StockCalculationStrategy strategy;

    public StockService(StockCalculationStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(StockCalculationStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculateCost(List<StockMovement> movements, int saleQuantity) {
        return strategy.calculateCost(movements, saleQuantity);
    }
}