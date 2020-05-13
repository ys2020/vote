package cn.vote.service.impl;

import cn.vote.dao.UtableMapper;
import cn.vote.pojo.Utable;
import cn.vote.service.UtableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtableServiceImpl implements UtableService {
    @Autowired
    UtableMapper utableMapper;

    @Override
    public List<Utable> getUtable() {
        return utableMapper.getUtable();
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return utableMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Utable record) {
        return utableMapper.insert(record);
    }

    @Override
    public int insertSelective(Utable record) {
        return utableMapper.insertSelective(record);
    }

    @Override
    public Utable selectByPrimaryKey(Integer id) {
        return utableMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Utable record) {
        return utableMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Utable record) {
        return utableMapper.updateByPrimaryKey(record);
    }
}
