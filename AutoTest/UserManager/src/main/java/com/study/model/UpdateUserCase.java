package com.study.model;

import lombok.Data;

@Data
public class UpdateUserCase {
    private int id;
    private int UserId;
    private String userName;
    private int is_del;
    private int permission;
    private int excepted;

}
