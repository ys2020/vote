package cn.vote.dao;

import cn.vote.pojo.Huati;
import cn.vote.pojo.Utable;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UtableMapper {
    @Select("select * from utable")
    List<Utable> getUtable();

    int deleteByPrimaryKey(Integer id);

    int insert(Utable record);

    int insertSelective(Utable record);

    Utable selectByPrimaryKey(Integer id);
    @Select("select * from utable where uid=#{uid} and hid=#{hid}")
    Utable selectByUidAndHid(@Param("uid") Integer uid, @Param("hid")Integer hid);

    int updateByPrimaryKeySelective(Utable record);

    int updateByPrimaryKey(Utable record);
}