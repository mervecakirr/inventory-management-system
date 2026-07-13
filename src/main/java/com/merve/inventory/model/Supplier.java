package com.merve.inventory.model;

public class Supplier {

    private Long id;
    private String companyName;
    private String email;
    private String phone;

    public Supplier() {
    }

    public Supplier(Long id,
                    String companyName,
                    String email,
                    String phone) {

        this.id = id;
        this.companyName = companyName;
        this.email = email;
        this.phone = phone;
    }
}