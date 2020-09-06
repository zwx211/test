package com.study.model;

import lombok.Data;

@Data
public class User {
    private int id;
    private String name;
    private String password;
    private int permission;
    private int is_del;
    @Override
    public String toString(){
        return ("id:"+id+","+
                "{name:"+name+","+
                "password:"+password+","+
                "permission:"+permission+","+
                "is_del:"+is_del+"}"
                );
    }
}
