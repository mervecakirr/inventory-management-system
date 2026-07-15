package com.merve.inventory.model.entity;

import com.merve.inventory.model.enums.MovementType;

import java.time.LocalDate;

public class StockMovement {

    private Long id;

    private Product product;

    private int quantity;

    private double unitPrice;

    private MovementType movementType;

    private LocalDate movementDate;

    public StockMovement() {
    }

    public StockMovement(Long id,
                         Product product,
                         int quantity,
                         double unitPrice,
                         MovementType movementType,
                         LocalDate movementDate) {

        this.id = id;
        this.product = product;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.movementType = movementType;
        this.movementDate = movementDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public MovementType getMovementType() {
        return movementType;
    }

    public void setMovementType(MovementType movementType) {
        this.movementType = movementType;
    }

    public LocalDate getMovementDate() {
        return movementDate;
    }

    public void setMovementDate(LocalDate movementDate) {
        this.movementDate = movementDate;
    }
}