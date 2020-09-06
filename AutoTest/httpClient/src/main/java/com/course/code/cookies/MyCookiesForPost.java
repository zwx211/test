package com.course.code.cookies;

import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.cookie.Cookie;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class MyCookiesForPost {
    private String url;
    private CookieStore store;
    private ResourceBundle bundle;
    @BeforeTest
    public void getUrl(){
        //获取公共的url
        bundle = ResourceBundle.getBundle("application", Locale.CHINESE);
        url = bundle.getString("test.url");
    }
    @Test
    public void testGetCookie() throws IOException {
        String uri = bundle.getString("getCookies.uri");
        //拼接url
        String testUrl = this.url + uri;
        //发起get请求
        HttpGet get = new HttpGet(testUrl);
        DefaultHttpClient client = new DefaultHttpClient();
        //获取响应数据
        HttpResponse response = client.execute(get);
        //获取cookie数据
        this.store = client.getCookieStore();
        List<Cookie> list = store.getCookies();
        for (Cookie cookie : list) {
            String name = cookie.getName();
            String val = cookie.getValue();
            System.out.println("cookie name=" + name + "  cookie value=" + val);
        }
    }
    //携带cookie信息的post请求
    @Test(dependsOnMethods = {"testGetCookie"})
    public  void cookiePost() throws IOException {
        //获取uri
        String uri = bundle.getString("CookiePost.uri");
        //拼接url
        String testUrl = this.url+uri;
        //声明一个post方法；
        HttpPost post = new HttpPost(testUrl);
        //声明一个httpclient对象，执行post方法；
        DefaultHttpClient client = new DefaultHttpClient();
        //创建json对象,put 请求参数
        JSONObject para = new JSONObject();
        para.put("name","wuzixian");
        para.put("age","12");
        //设置请求头信息---公共部分可提取
        post.setHeader("content-type","application/json");
        //将参数信息传入方法---需要优化，参数不可写入代码中
        StringEntity entity = new StringEntity(para.toString(),"utf-8");
        post.setEntity(entity);
        //声明一个对象存储响应信息
        String result;
        //设置cookie信息
        client.setCookieStore(this.store);
        //执行post方法
        HttpResponse response=client.execute(post);
        //获取响应结果
        result = EntityUtils.toString(response.getEntity());
        System.out.println(result);
        //判断结果是否符合预期
        //将返回结果转化为json对象
        JSONObject jsonResult = new JSONObject(result);
        //具体判断返回的值
        String success = (String)jsonResult.get("wuzixan");
        String status = (String)jsonResult.get("status");
        //获取结果
        Assert.assertEquals(success,"success");
        Assert.assertEquals(status,"111");







        }







    }

