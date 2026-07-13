package com.merve.inventory.singleton;

import java.time.LocalDateTime;

public class Logger {

    private static Logger instance;

    private Logger() {
    }

    public static Logger getInstance() {

        if (instance == null) {
            instance = new Logger();
        }

        return instance;
    }

    public void info(String message) {
        System.out.println("[INFO] " + LocalDateTime.now() + " : " + message);
    }

    public void error(String message) {
        System.out.println("[ERROR] " + LocalDateTime.now() + " : " + message);
    }
}