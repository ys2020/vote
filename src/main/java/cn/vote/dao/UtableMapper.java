package cn.vote.dao;

import cn.vote.pojo.Utable;

public interface UtableMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Utable record);

    int insertSelective(Utable record);

    Utable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Utable record);

    int updateByPrimaryKey(Utable record);
}