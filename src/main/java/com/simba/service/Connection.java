package com.simba.service;

public class Connection {
    private static final Connection INSTANCE = new Connection();

    private Connection() {
    }

    public static Connection getInstance() {
        if (INSTANCE == null) {
            return new Connection();
        }
        return INSTANCE;
    }
}

