package com.study.controller;

import com.study.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@Api(value = "v1",description = "这是我的第一个版本的demo")
@RequestMapping("v1")
public class Demo {

    //首先获取一个执行sql语句的对象

    @Autowired
    private SqlSessionTemplate template;

    @RequestMapping( value = "/getUserCount", method = RequestMethod.GET )
    @ApiOperation( value = "可以获取到用户数", httpMethod = "GET" )
    public int getUserCount() {
        return template.selectOne("getUserCount");
    }
    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    @ApiOperation(value = "增加一个用户",httpMethod = "POST")
    public int addUser(@RequestBody User user) {
        int result = template.insert("addUser",user);
        return result;



    }
    @RequestMapping(value = "/updateUser",method = RequestMethod.POST )
    @ApiOperation(value = "更新一个用户信息",httpMethod = "POST")
    public int updateUser(@RequestBody User user){
        int result =  template.update("updateUser",user);
        return result;
    }
    @RequestMapping(value = "/delUser",method = RequestMethod.GET)
    @ApiOperation(value = "删除用户",httpMethod = "GET")
    public int delUSer(@RequestParam int id){
        return  template.delete("delUser",id);

    }
}


