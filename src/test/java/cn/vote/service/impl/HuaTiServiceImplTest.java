package cn.vote.service.impl;

import cn.vote.BaseTest;
import cn.vote.dao.HuatiMapper;
import cn.vote.pojo.Huati;
import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.logging.SimpleFormatter;


public class HuaTiServiceImplTest extends BaseTest {
    @Autowired
    private HuatiMapper huatiMapper;
    @Test
    public void testSelectByPrimaryKey() {
        Huati huati = huatiMapper.selectByPrimaryKey(1);
        System.out.println(huati.toString());
    }

    @Test
    public void insert() {

        Date utilDate = new Date();//util.Date
        //util.Date转sql.Date
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        System.out.println("sqlDate : " + sqlDate);
       


    }

    @Test
    public void selectByUidAndHname() {
        Huati abc = huatiMapper.selectByUidAndHname(2, "abc");
        System.out.println(abc.toString());
    }

    @Test
    public void getHuati() {
        List<Huati> huatis =huatiMapper.getHuati(2);
        for (Huati hh:huatis
             ) {
            System.out.println(hh.toString());
        }
    }
}