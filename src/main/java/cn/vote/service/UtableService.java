package cn.vote.service;

import cn.vote.pojo.Huati;
import cn.vote.pojo.Utable;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UtableService {
    List<Utable> getUtable();

    int deleteByPrimaryKey(Integer id);

    int insert(Utable record);

    int insertSelective(Utable record);

    Utable selectByPrimaryKey(Integer id);

    Utable selectByUidAndHid(Integer uid,Integer hid);

    int updateByPrimaryKeySelective(Utable record);

    int updateByPrimaryKey(Utable record);
}
