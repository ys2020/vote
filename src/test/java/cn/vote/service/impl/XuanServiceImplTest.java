package cn.vote.service.impl;

import cn.vote.BaseTest;
import cn.vote.dao.XuanMapper;
import cn.vote.pojo.Xuan;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class XuanServiceImplTest extends BaseTest {
    @Autowired
    XuanMapper xuanMapper;
    @Test
    public void getXuan() {
        Xuan xx =new Xuan(1,"ccss",3333,"hahaha");
        List<Xuan> xuan = xuanMapper.getXuan();
        for (Xuan xiang:xuan) {
            System.out.println(xiang.toString());
        }
    }

    @Test
    public void insert() {
    }

    @Test
    public void selectByPrimaryKey() {
    }

    @Test
    public void dovote() {
        int dovote = xuanMapper.dovote(4);
        System.out.println(dovote);
    }
}