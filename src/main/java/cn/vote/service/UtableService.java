package cn.vote.service;

import cn.vote.pojo.Huati;
import cn.vote.pojo.Utable;

import java.util.List;

public interface UtableService {
    List<Utable> getUtable();

    int deleteByPrimaryKey(Integer id);

    int insert(Utable record);

    int insertSelective(Utable record);

    Utable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Utable record);

    int updateByPrimaryKey(Utable record);
}
