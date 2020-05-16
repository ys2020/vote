package cn.vote.controller;

import cn.vote.pojo.Utable;
import cn.vote.pojo.Xuan;
import cn.vote.service.UtableService;
import cn.vote.service.XuanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UtableController {
    @Autowired
    XuanService xuanService;
    @Autowired
    UtableService service;

    @RequestMapping(value = "/addvote",method = RequestMethod.GET)
    @ResponseBody
    public Object dovote(Integer xid,Integer hid,Integer uid){
        Utable utable1 = service.selectByUidAndHid(uid, hid);
        if (null!=utable1){
            return "false";
        }
        int dovote = xuanService.dovote(xid, hid);
        if (dovote>0){
            Utable utable = new Utable(uid,hid);
            service.insert(utable);
        }
        Xuan xuans = xuanService.selectxdid(xid, hid);
        return xuans;
    }
}
