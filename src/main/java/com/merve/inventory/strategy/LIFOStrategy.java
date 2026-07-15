package com.merve.inventory.strategy;

import com.merve.inventory.model.entity.StockMovement;
import com.merve.inventory.model.enums.MovementType;

import java.util.List;

public class LIFOStrategy implements StockCalculationStrategy {

    @Override
    public double calculateCost(List<StockMovement> movements,
                                int saleQuantity) {

        double total = 0;
        int remaining = saleQuantity;

        for (int i = movements.size() - 1; i >= 0; i--) {

            StockMovement movement = movements.get(i);

            if (movement.getMovementType() != MovementType.PURCHASE)
                continue;

            if (remaining <= 0)
                break;

            int used = Math.min(
                    remaining,
                    movement.getQuantity());

            total += used * movement.getUnitPrice();

            remaining -= used;

        }

        return total;

    }
}