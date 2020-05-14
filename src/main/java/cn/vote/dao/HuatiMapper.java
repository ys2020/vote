package cn.vote.dao;

import cn.vote.pojo.Huati;
import cn.vote.pojo.Xuan;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface HuatiMapper {
    //查看话题列表
    @Select("select * from huati")
    List<Huati> getHuati();

    int deleteByPrimaryKey(@Param("hid")Integer  hid);
    //添加话题
    int insert(Huati record);

    int insertSelective(Huati record);

    Huati selectByPrimaryKey(Integer hid);
    //根据uid 用户id和hname 话题名称 查找话题数据
    Huati selectByUidAndHname(@Param("uid")Integer uid,@Param("hname")String hname);

    int updateByPrimaryKeySelective(Huati record);

    int updateByPrimaryKey(Huati record);

}