package com.merve.inventory.model;

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
}