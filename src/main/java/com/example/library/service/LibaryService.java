package com.example.library.service;

import com.example.library.model.*;

import java.util.ArrayList;
import java.util.List;

public class LibaryService{

    private List<Entity> items = new ArrayList<>();
    private List<User> users = new ArrayList<>();


    public boolean addEntity(Entity entity) {
        items.add(entity);
        return true;
    }
    
    public void addUser(String userName, String userId){
       users.add(new User(userName, userId));
    }

    


}