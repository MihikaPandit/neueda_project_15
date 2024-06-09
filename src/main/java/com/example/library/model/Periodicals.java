package com.example.library.model;


public class Periodicals extends Entity{

    public Periodicals(String id, String name, boolean borrowable) {
        super(id, name, borrowable);
    }

    public Periodicals (String id, String name) {
        super(id, name, false);
    }
}
