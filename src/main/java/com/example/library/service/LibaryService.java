package com.example.library.service;

import com.example.library.model.*;

import java.util.ArrayList;
import java.util.List;

public class LibaryService{

    private List<Entity> items = new ArrayList<>();
    private List<User> users = new ArrayList<>();


    public void addBook(String id, String name ){
           items.add(new Book(id, name)) ;
    }

    public void addCD(String id, String name){
        items.add(new Cd(id, name)) ;
    }

    public void addDvd(String id, String name){
        items.add(new Dvd(id, name)) ;
    }

    public void addUser(String userName, String userId){
       users.add(new User(userName, userId));
    }

    


}