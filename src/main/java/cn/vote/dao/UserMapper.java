package cn.vote.dao;

import cn.vote.pojo.User;
import org.mybatis.spring.annotation.MapperScan;


public interface UserMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}