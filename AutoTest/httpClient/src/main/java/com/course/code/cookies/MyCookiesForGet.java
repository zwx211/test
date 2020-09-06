package com.course.code.cookies;

import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class MyCookiesForGet {
    private String url;
    private ResourceBundle bundle;
    private CookieStore store;
    @BeforeTest
    public void beforeTest(){
        //读取资源属性文件:bundle主要是用来读取properties文件
        bundle = ResourceBundle.getBundle("application", Locale.CHINESE);
        //读取bundle中的数据
        url = bundle.getString("test.url");
    }
    @Test
    public void testGetCookies() throws IOException {
        String result;
        //从配置文件中读取uri
        String uri = bundle.getString("getCookies.uri");
        //拼接url
        String testUrl = this.url+uri;
        //发起get请求
        HttpGet get = new HttpGet(testUrl);

        DefaultHttpClient client = new DefaultHttpClient();
        //获取响应数据
        HttpResponse response = client.execute(get);
        result = EntityUtils.toString(response.getEntity(),"utf-8");
        System.out.println(result);
        //获取cookie信息
        this.store = client.getCookieStore();
        List<Cookie> CookieList = store.getCookies();
        for(Cookie cookie:CookieList){
            String name = cookie.getName();
            String val = cookie.getValue();
            System.out.println("cookie name="+ name + "cookie value="+ val);
        }

    }
    @Test(dependsOnMethods = {"testGetCookies"})
    public void testWithCookies() throws IOException {
        String uri =bundle.getString("cookieGet.uri");
        String testUrl = this.url+uri;
        HttpGet get = new HttpGet(testUrl);
        DefaultHttpClient client = new DefaultHttpClient();
        //设置cookie信息；
        client.setCookieStore(this.store);
        //访问get请求
        HttpResponse response = client.execute(get);
        int StatusCode = response.getStatusLine().getStatusCode();
        if(StatusCode==200){
            String result = EntityUtils.toString(response.getEntity());
            System.out.println(result);
            System.out.println("这是一个携带cookie的get请求");
        }

    }
}
