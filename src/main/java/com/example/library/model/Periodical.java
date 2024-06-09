package com.example.library.model;

public class Periodical extends Entity {

    public Periodical(String id, String name, boolean borrowable) {
        super(id, name, borrowable);
    }

    public Periodical(String id, String name) {
        super(id, name, false);
    }
}
