package com.example.library.model;

public class Cd extends Entity {

    public Cd(String id, String name, boolean borrowable) {
        super(id, name, borrowable);
    }

    public Cd(String id, String name) {
        super(id, name, true);
    }
}
