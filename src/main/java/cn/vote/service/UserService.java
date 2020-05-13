package cn.vote.service;

import cn.vote.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserService {
    User login(User user);

    User getuserName(String name);

    int deleteByPrimaryKey(Integer uid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
