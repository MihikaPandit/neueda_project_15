package com.example.library.model;

public class Book extends Entity {

    public Book(String id, String name, boolean borrowable) {
        super(id, name, borrowable);
    }

    public Book (String id, String name) {
        super(id, name, true);
    }
}
