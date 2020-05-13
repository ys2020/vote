package cn.vote.controller;

import cn.vote.pojo.Xuan;
import cn.vote.service.UserService;
import cn.vote.service.XuanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class xuanController {
    @Autowired
    XuanService xuanService;
    @RequestMapping("/getxuan")
    public String getXuan(Model model){
        List<Xuan> xuan = xuanService.getXuan();
        model.addAttribute("xuan",xuan);
        return "tongji";
    }
}
