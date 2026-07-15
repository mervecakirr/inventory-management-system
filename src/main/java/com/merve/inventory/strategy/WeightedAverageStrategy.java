package com.merve.inventory.strategy;

import com.merve.inventory.model.entity.StockMovement;
import com.merve.inventory.model.enums.MovementType;

import java.util.List;

public class WeightedAverageStrategy implements StockCalculationStrategy {

    @Override
    public double calculateCost(List<StockMovement> movements,
                                int saleQuantity) {

        double totalCost = 0;
        int totalQuantity = 0;

        for (StockMovement movement : movements) {

            if (movement.getMovementType() == MovementType.PURCHASE) {

                totalCost += movement.getQuantity()
                        * movement.getUnitPrice();

                totalQuantity += movement.getQuantity();

            }

        }

        if (totalQuantity == 0)
            return 0;

        double average = totalCost / totalQuantity;

        return average * saleQuantity;

    }
}