package cn.vote.service.impl;

import cn.vote.BaseTest;
import cn.vote.dao.UserMapper;
import cn.vote.pojo.User;
import cn.vote.service.UserService;
import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImplTest1 extends BaseTest {
    @Autowired
    private UserMapper userMapper;

    public void testDeleteByPrimaryKey() {

    }

    public void testInsert() {
    }

    public void testInsertSelective() {
    }
    @Test
    public void testSelectByPrimaryKey() {

        User user = userMapper.selectByPrimaryKey(1);
        System.out.println(user.toString());
    }
}