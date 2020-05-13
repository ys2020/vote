package cn.vote.service.impl;

import cn.vote.BaseTest;
import cn.vote.dao.HuatiMapper;
import cn.vote.pojo.Huati;
import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class HuaTiServiceImplTest extends BaseTest {
    @Autowired
    private HuatiMapper huatiMapper;
    @Test
    public void testSelectByPrimaryKey() {
        Huati huati = huatiMapper.selectByPrimaryKey(1);
        System.out.println(huati.toString());
    }
}