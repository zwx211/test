package com.study.cases;

import com.study.config.TestConfig;
import com.study.model.UpdateUserCase;
import com.study.utils.DataBaseUtils;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;

import java.io.IOException;

public class UpdateUserTest {
    @Test(dependsOnGroups = "loginTrue",description = "更新id为1的用户")
    public void updateUser() throws IOException {
        SqlSession sqlSession = DataBaseUtils.getSqlSession();
        UpdateUserCase updateUserCase = sqlSession.selectOne("updateUserCase",1);
        System.out.println(TestConfig.updateUserInfoUrl);

    }
    @Test(dependsOnGroups = "loginTrue",description = "删除用户接口测试")
    public void delUser() throws IOException {
        SqlSession sqlSession = DataBaseUtils.getSqlSession();
        UpdateUserCase updateUserCase = sqlSession.selectOne("updateUserCase",1);

    }
}
