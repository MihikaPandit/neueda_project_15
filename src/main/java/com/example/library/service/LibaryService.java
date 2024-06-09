package com.example.library.service;

import com.example.library.model.Book;
import com.example.library.model.Cd;
import com.example.library.model.Dvd;
import com.example.library.model.Entity;

import java.util.ArrayList;
import java.util.List;

public class LibaryService{

    private List<Entity> items = new ArrayList<>();

    public void addBook(String id, String name){
           items.add(new Book(id, name)) ;
    }

    public void addCD(String id, String name){
        items.add(new Cd(id, name)) ;
    }

    public void addCD(String id, String name){
        items.add(new Dvd(id, name)) ;
    }

    


}