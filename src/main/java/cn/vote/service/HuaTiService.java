package cn.vote.service;

import cn.vote.pojo.Huati;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface HuaTiService {
    List<Huati> getHuati(Integer uid);

    int deleteByPrimaryKey(Integer hid);

    int insert(Huati record);

    int insertSelective(Huati record);

    Huati selectByPrimaryKey(Integer hid);

    Huati selectByUidAndHname(Integer uid,String hname);

    int updateByPrimaryKeySelective(Huati record);

    int updateByPrimaryKey(Huati record);
}
