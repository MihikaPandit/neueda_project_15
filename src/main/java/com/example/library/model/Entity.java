package com.example.library.model;

public abstract class Entity {
    private String name;
    private String id;

    private boolean isBorrowed = false;
    private boolean borrowable = false;

    public Entity(boolean borrowable, boolean isBorrowed, String id, String name) {
        this.borrowable = borrowable;
        this.isBorrowed = isBorrowed;
        this.id = id;
        this.name = name;
    }
}
