package com.merve.inventory.demo;

import com.merve.inventory.singleton.DatabaseConnection;
import com.merve.inventory.singleton.Logger;

public class SingletonDemo {

    public static void main(String[] args) {

        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        db1.connect();

        logger1.info("Product added.");
        logger2.error("Stock not found.");

        System.out.println();
        System.out.println("Database objects same? " + (db1 == db2));
        System.out.println("Logger objects same? " + (logger1 == logger2));
    }
}