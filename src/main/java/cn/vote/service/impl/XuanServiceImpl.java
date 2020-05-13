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
        return xuanMapper.deleteByPrimaryKey(xid);
    }

    @Override
    public int insert(Xuan record) {
        return xuanMapper.insert(record);
    }

    @Override
    public int insertSelective(Xuan record) {
        return xuanMapper.insertSelective(record);
    }

    @Override
    public Xuan selectByPrimaryKey(Integer xid) {
        return xuanMapper.selectByPrimaryKey(xid);
    }

    @Override
    public int updateByPrimaryKeySelective(Xuan record) {
        return xuanMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Xuan record) {
        return xuanMapper.updateByPrimaryKey(record);
    }
}
