package com.merve.inventory.model.entity;

public class Warehouse {

    private Long id;
    private String name;
    private String location;

    public Warehouse() {
    }

    public Warehouse(Long id,
                     String name,
                     String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}