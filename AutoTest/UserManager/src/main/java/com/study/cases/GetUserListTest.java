package com.study.cases;

import com.study.config.TestConfig;
import com.study.model.GetUserListInfo;
import com.study.utils.DataBaseUtils;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;

import java.io.IOException;

public class GetUserListTest {
    @Test(dependsOnGroups = "loginTrue",description = "查看id为1或2的用户")
    public void getUserList() throws IOException {
        SqlSession sqlSession = DataBaseUtils.getSqlSession();
        GetUserListInfo getUserListInfo = sqlSession.selectOne("getUserListInfo");
        System.out.println(TestConfig.getUserListUrl);


    }
}
