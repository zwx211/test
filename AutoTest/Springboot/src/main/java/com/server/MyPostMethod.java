package com.server;

import com.bean.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@Api(value = "/",description="post请求")
@RequestMapping("v1")
public class MyPostMethod {
    //cookie变量用来装cookie信息
    private static Cookie cookie;
    //用户登录成功，获取cookie，再获取商品列表
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ApiOperation(value = "登录接口，获取cookie，获取商品列表",httpMethod = "POST")
    public String login(HttpServletResponse response,
                        @RequestParam (value = "userName",required = true) String userName,
                        @RequestParam (value = "passWord",required = true) String passWord
    ){
        cookie= new Cookie("login","true");
        if(userName.equals("wuzixian")&&passWord.equals("123456")){
            return "登录成功";
        }
        return "密码错误";
    }
    @RequestMapping(value = "/getUserList",method = RequestMethod.POST)
    @ApiOperation(value = "获取用户列表",httpMethod = "POST")
    public String getUserList(HttpServletRequest request,
                            @RequestBody User user){
        //获取cookies
        Cookie[] cookies = request.getCookies();
        //验证cookie是否合法
        User user1 = new User();
        for (Cookie cookie:cookies){
            if(cookie.getName().equals("login")
                    &&cookie.getValue().equals("true")
                    &&user.getName().equals("wuzixian")
                    &&user.getPassword().equals("123456") ){

                user1.setAge(18);
                user1.setSex("男");
                user1.setName("shenpanlong");
                return user1.toString();

            }


        }
        return "参数不合法";

    }








}
