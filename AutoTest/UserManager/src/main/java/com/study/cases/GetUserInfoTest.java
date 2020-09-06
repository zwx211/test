package com.study.cases;

import com.study.config.TestConfig;
import com.study.model.GetUserInfoCase;
import com.study.utils.DataBaseUtils;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;

import java.io.IOException;

public class GetUserInfoTest {
    @Test( dependsOnGroups = "loginTrue", description = "获取id为1用户" )
    public void getUserInfo() throws IOException {
        SqlSession sqlSession = DataBaseUtils.getSqlSession();
        GetUserInfoCase getUserInfoCase = sqlSession.selectOne("getUserInfo",1);
        System.out.println(TestConfig.getUserInfoUrl);
    }
}
