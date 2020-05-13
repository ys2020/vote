package cn.vote.dao;

import cn.vote.pojo.Huati;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface HuatiMapper {
    @Select("select * from huati")
    List<Huati> getHuati();

    int deleteByPrimaryKey(@Param("hid")Integer  hid);

    int insert(Huati record);

    int insertSelective(Huati record);

    Huati selectByPrimaryKey(Integer hid);

    int updateByPrimaryKeySelective(Huati record);

    int updateByPrimaryKey(Huati record);
}