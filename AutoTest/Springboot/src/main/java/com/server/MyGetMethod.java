package com.server;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@RestController
@Api(value = "/",description = "全部的get方法")
public class MyGetMethod {
    @RequestMapping(value = "/cookieGet",method = RequestMethod.GET)
    @ApiOperation(value = "通过这个方法可以获取到cookie",httpMethod = "GET")
    public String getCookies(HttpServletResponse response){
        //HttpServletRequest 装请求信息的类
        //HttpServletResponse 装响应信息的类
        Cookie cookie = new Cookie("login","true");
        response.addCookie(cookie);
        return "para cookie get";
    }
    /*
    要求客户端携带cookies进行get请求
     */
    @RequestMapping(value = "/get/with/cookie",method = RequestMethod.GET)
    @ApiOperation(value = "这个方法是携带cookie进行get请求",httpMethod = "GET")
    public String getWithCookie(HttpServletRequest request){
        Cookie [] cookies = request.getCookies();
        if(Objects.isNull(cookies)){
            return "必须携带cookie";

        }
        for(Cookie cookie:cookies){
            if(cookie.getName().equals("login")&&cookie.getValue().equals("true")){
                return "访问成功";
            }
        }
        return "必须携带cookie";

    }
    /*
    需要携带请求参数的get请求
     */
    @RequestMapping(value = "get/with/para",method = RequestMethod.GET)
    @ApiOperation(value = "这个方法必须携带参数进行get请求",httpMethod = "GET")
    public Map<String,Integer> getList(@RequestParam Integer start,
                                       @RequestParam Integer end){
        Map<String,Integer> mylist = new HashMap<>();
        mylist.put("鞋子",30);
        mylist.put("T恤",30);
        mylist.put("风衣",30);
        mylist.put("牛仔裤",30);
        return mylist;
    }
    //第二种带参数的get请求
    //url=IP+port+/get/with/para/10/20
    @RequestMapping(value = "/get/with/{start}/{end}")
    @ApiOperation(value = "带参数的get请求的第二种写法",httpMethod = "GET")
    public Map<String ,Integer> getWithPara1(@PathVariable Integer start,
                                             @PathVariable Integer end){
        Map<String ,Integer> mylist1 = new HashMap<>();
        mylist1.put("裤子",100);
        mylist1.put("卫衣",30);
        return mylist1;


    }



}
