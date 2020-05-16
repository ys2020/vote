package cn.vote.dao;

import cn.vote.pojo.Xuan;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface XuanMapper {
    @Select("select * from xuan")
    List<Xuan> getXuan();
    @Select("select * from xuan where hid =#{hid}")
    List<Xuan> selectXuanByHid(@Param("hid") Integer hid);

    List<Xuan> selectByHname(String hname);

    int deleteByPrimaryKey(Integer xid);
    @Delete("delete from xuan where hid=#{hid}")
    int deleteByhid(@Param("hid") Integer hid);
    @Delete("delete from xuan where hid=#{hid} and xid=#{xid}")
    int deleteByhidAndxid(@Param("hid") Integer hid,@Param("xid") Integer xid);

    int insert(Xuan record);

    int insertSelective(Xuan record);

    Xuan selectByPrimaryKey(Integer xid);

    int updateByPrimaryKeySelective(Xuan record);

    int updateByPrimaryKey(Xuan record);
    @Update("UPDATE xuan SET xcount=xcount+1 WHERE xid =#{xid} and hid =#{hid}")
    int dovote(@Param("xid")Integer xid,@Param("hid")Integer hid);
    @Select("select * from xuan WHERE xid =#{xid} and hid =#{hid}")
    Xuan selectxdid(@Param("xid")Integer xid,@Param("hid")Integer hid);
}