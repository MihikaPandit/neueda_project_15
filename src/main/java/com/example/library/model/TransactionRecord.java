package com.example.library.model;

public class TransactionRecord {

    private User user;
    private Entity entity;
    private String remark;

    public TransactionRecord(User user, Entity entity, String remark) {
        this.user = user;
        this.entity = entity;
        this.remark = remark;
    }

    public String toString() {
        return this.user + " transaction on \n" + this.entity + " \nRemark: " + this.remark;
    }
}
