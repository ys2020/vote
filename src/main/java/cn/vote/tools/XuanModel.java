package cn.vote.tools;


import cn.vote.pojo.User;
import cn.vote.pojo.Xuan;

import java.util.List;

public class XuanModel {
    //选项对象集合
    private List<Xuan> xuans;

    public XuanModel(List<Xuan> xuans) {
        this.xuans = xuans;
    }

    public XuanModel() {
    }

    public List<Xuan> getXuans() {
        return xuans;
    }

    public void setXuans(List<Xuan> xuans) {
        this.xuans = xuans;
    }
}
