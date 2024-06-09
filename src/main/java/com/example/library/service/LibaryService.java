package com.example.library.service;

import com.example.library.model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LibaryService{

    private List<Entity> items = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    private HashMap<String, TransactionRecord> borrowedList;


    public boolean addEntity(Entity entity) {
        items.add(entity);
        return true;
    }

    public Entity findById(String id) {
        for (Entity entity : this.items) {
            if (id.equals(entity.getId())) {
                return entity;
            }
        }

        return null;
    }

    public User findUserById(String id) {
        for (User user : this.users) {
            if (id.equals(user.getUserId())) {
                return user;
            }
        }

        return null;
    }


    public void viewInfo(String id) {
        Entity entity = findById(id);
        System.out.println(entity);
    }


    public void addUser(String userName, String userId){
        users.add(new User(userName, userId));
    }

    public boolean borrow(String userId, String EntityId, String remark) {
        Entity entity = this.findById(EntityId);

        if (entity == null) {
            System.out.println("Item not found");
            return false;
        }

        if (!entity.isBorrowable()) {
            System.out.println("Item Cannot be Borrowed");
            return false;
        }

        if (entity.getIsBorrowed()) {
            System.out.println("Not available in the library (already borrowed by someone)");
            return false;
        }

        User user = findUserById(userId);

        if (user == null) {
            System.out.println("user not found");
            return false;
        }

        TransactionRecord transactionRecord = new TransactionRecord(user, entity, remark);
        entity.setIsBorrowed(true);
        borrowedList.put(entity.getId(), transactionRecord);


        return true;
    }





}