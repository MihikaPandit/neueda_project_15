package com.example.library.model;

public class Dvd extends Entity{

    public Dvd(String id, String name, boolean borrowable) {
        super(id, name, borrowable);
    }

    public Dvd (String id, String name) {
        super(id, name, true);
    }
}
