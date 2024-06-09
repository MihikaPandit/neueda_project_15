package com.example.library.model;

public abstract class Entity {
    private String name;
    private String id;

    private boolean isBorrowed = false;
    private boolean borrowable = false;

    public Entity(String id, String name, boolean borrowable) {
        this.borrowable = borrowable;
        this.id = id;
        this.name = name;
    }

    public boolean isBorrowable() {
        return this.borrowable;
    }

    public boolean getIsBorrowed() {
        return this.isBorrowed;
    }

    public void setIsBorrowed(boolean status) {
        this.isBorrowed = status;
    }
}
