package cn.vote.service.impl;

import cn.vote.dao.HuatiMapper;
import cn.vote.pojo.Huati;
import cn.vote.service.HuaTiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HuaTiServiceImpl implements HuaTiService {
    @Autowired
    HuatiMapper huatiMapper;

    @Override
    public List<Huati> getHuati() {
        return huatiMapper.getHuati();
    }

    @Override
    public int deleteByPrimaryKey(Integer hid) {
        return huatiMapper.deleteByPrimaryKey(hid);
    }

    @Override
    public int insert(Huati record) {
        return huatiMapper.insert(record);
    }

    @Override
    public int insertSelective(Huati record) {
        return huatiMapper.insertSelective(record);
    }

    @Override
    public Huati selectByPrimaryKey(Integer hid) {
        return huatiMapper.selectByPrimaryKey(hid);
    }

    @Override
    public int updateByPrimaryKeySelective(Huati record) {
        return huatiMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Huati record) {
        return huatiMapper.updateByPrimaryKey(record);
    }
}
