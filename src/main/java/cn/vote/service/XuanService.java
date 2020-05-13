package cn.vote.service;

import cn.vote.pojo.Xuan;

import java.util.List;

public interface XuanService {
    List<Xuan> getXuan();

    int deleteByPrimaryKey(Integer xid);

    int insert(Xuan record);

    int insertSelective(Xuan record);

    Xuan selectByPrimaryKey(Integer xid);

    int updateByPrimaryKeySelective(Xuan record);

    int updateByPrimaryKey(Xuan record);
}
