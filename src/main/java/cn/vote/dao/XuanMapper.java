package cn.vote.dao;

import cn.vote.pojo.Xuan;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface XuanMapper {
    @Select("select * from xuan")
    List<Xuan> getXuan();

    int deleteByPrimaryKey(Integer xid);

    int insert(Xuan record);

    int insertSelective(Xuan record);

    Xuan selectByPrimaryKey(Integer xid);

    int updateByPrimaryKeySelective(Xuan record);

    int updateByPrimaryKey(Xuan record);
    @Update("UPDATE xuan SET xcount=xcount+1 WHERE xid =#{id}")
    int dovote(Integer id);
}