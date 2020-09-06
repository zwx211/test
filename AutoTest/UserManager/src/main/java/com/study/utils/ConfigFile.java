package com.study.utils;

import com.study.model.InterfaceName;

import java.util.Locale;
import java.util.ResourceBundle;

public class ConfigFile {
    public static ResourceBundle bundle = ResourceBundle.getBundle("application", Locale.CHINESE);
    public static String getUrl(InterfaceName name){
        String address = bundle.getString("testUrl");
        String uri = "";
        //最终的url
        String ansUrl;
        if(name==InterfaceName.LOGIN){
            uri = bundle.getString("login.uri");

        }
        if(name==InterfaceName.GETUSERINFO){
            uri = bundle.getString("getUserInfo.uri");
        }
        if(name==InterfaceName.ADDUSER){
            uri = bundle.getString("addUser.uri");
        }
        if(name==InterfaceName.UPDATEUSER){
            uri = bundle.getString("updateUserInfo.uri");
        }
        if(name==InterfaceName.GETUSERLIST){
            uri = bundle.getString("getUserList.uri");
        }
        ansUrl= address+uri;
        return ansUrl;
    }
}
