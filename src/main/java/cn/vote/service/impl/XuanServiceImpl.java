package cn.vote.service.impl;

import cn.vote.dao.XuanMapper;
import cn.vote.pojo.Xuan;
import cn.vote.service.XuanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class XuanServiceImpl implements XuanService {
    @Autowired
    XuanMapper xuanMapper;
    @Override
    public List<Xuan> getXuan() {
        return xuanMapper.getXuan();
    }

    @Override
    public int deleteByPrimaryKey(Integer xid) {
        return 0;
    }

    @Override
    public int insert(Xuan record) {
        return 0;
    }

    @Override
    public int insertSelective(Xuan record) {
        return 0;
    }

    @Override
    public Xuan selectByPrimaryKey(Integer xid) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Xuan record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Xuan record) {
        return 0;
    }
}
