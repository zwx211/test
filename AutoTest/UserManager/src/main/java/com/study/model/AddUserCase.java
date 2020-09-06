package com.study.model;

import lombok.Data;

@Data
public class AddUserCase {
    private int id;
    private String userName;
    private String password;
    private int permission;
    private int is_del;
    private int excepted;
    @Override
    public  String toString(){
        return ("id:"+id+","+
                "{userName:"+userName+","+
                "password:"+password+","+
                "permission:"+permission+","+
                "is_del:"+is_del+","+
                "excepted"+excepted+"}"
        );
    }

}
