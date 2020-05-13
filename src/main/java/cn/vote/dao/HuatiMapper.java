package cn.vote.dao;

import cn.vote.pojo.Huati;

public interface HuatiMapper {
    int deleteByPrimaryKey(Integer hid);

    int insert(Huati record);

    int insertSelective(Huati record);

    Huati selectByPrimaryKey(Integer hid);

    int updateByPrimaryKeySelective(Huati record);

    int updateByPrimaryKey(Huati record);
}