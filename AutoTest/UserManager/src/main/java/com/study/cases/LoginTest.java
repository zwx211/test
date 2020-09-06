package com.study.cases;

import com.study.config.TestConfig;
import com.study.model.InterfaceName;
import com.study.model.LoginCase;
import com.study.utils.ConfigFile;
import com.study.utils.DataBaseUtils;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTest {

    @BeforeTest(groups = "loginTrue",description = "测试准备工作，获取HttpClient对象")
    public void beforeTest(){
        TestConfig.getUserInfoUrl = ConfigFile.getUrl(InterfaceName.GETUSERINFO);
        TestConfig.getUserListUrl = ConfigFile.getUrl(InterfaceName.GETUSERLIST);
        TestConfig.addUserUrl = ConfigFile.getUrl(InterfaceName.ADDUSER);
        TestConfig.loginUrl = ConfigFile.getUrl(InterfaceName.LOGIN);
        TestConfig.updateUserInfoUrl = ConfigFile.getUrl(InterfaceName.UPDATEUSER);

        TestConfig.httpClient = new DefaultHttpClient();
    }
    @Test(groups = "loginTrue",description = "用户登陆成功接口测试")
    public void loginTrue() throws IOException {
        SqlSession session = DataBaseUtils.getSqlSession();
        LoginCase loginCase = session.selectOne("loginCase",1);
        System.out.println(loginCase.toString());
        System.out.println(TestConfig.loginUrl);


    }
    @Test(groups = "loginFalse",description = "登录失败")
    public void loginFalse() throws IOException {
        SqlSession sqlSession = DataBaseUtils.getSqlSession();
        LoginCase loginCase = sqlSession.selectOne("loginCase",2);
        //System.out.println(loginCase.toString());
        System.out.println(TestConfig.loginUrl);


    }


}
