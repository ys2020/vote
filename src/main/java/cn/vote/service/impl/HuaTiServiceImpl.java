package cn.vote.service.impl;

import cn.vote.dao.HuatiMapper;
import cn.vote.pojo.Huati;
import cn.vote.service.HuaTiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HuaTiServiceImpl implements HuaTiService {
    @Autowired
    HuatiMapper huatiMapper;
    @Override
    public int deleteByPrimaryKey(Integer hid) {
        return 0;
    }

    @Override
    public int insert(Huati record) {
        return 0;
    }

    @Override
    public int insertSelective(Huati record) {
        return 0;
    }

    @Override
    public Huati selectByPrimaryKey(Integer hid) {
        return huatiMapper.selectByPrimaryKey(hid);
    }

    @Override
    public int updateByPrimaryKeySelective(Huati record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Huati record) {
        return 0;
    }
}
