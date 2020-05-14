package cn.vote.controller;

import cn.vote.pojo.Huati;
import cn.vote.pojo.Xuan;
import cn.vote.service.HuaTiService;
import cn.vote.service.UserService;
import cn.vote.service.XuanService;
import cn.vote.tools.XuanModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class xuanController {
    @Autowired
    XuanService xuanService;
    @Autowired
    HuaTiService service;
    @RequestMapping("/getxuan")
    public String getXuan(Model model){
        List<Xuan> xuan = xuanService.getXuan();
        model.addAttribute("xuan",xuan);
        return "index";
    }
    @RequestMapping(value = "/addxuan",method = RequestMethod.POST)
    public String addxuan(XuanModel xuanModel,Model model){
        //使用集合封装多个选项对象
        List<Xuan> xuans =xuanModel.getXuans();

            for (Xuan xuan:xuans) {
                //循环添加选项数据
                System.out.println(xuan.toString());
                int insert = xuanService.insert(xuan);
            }
        //添加成功去投票页面查看
        int hid =xuans.get(0).getHid();
        List<Xuan> xuans1 = xuanService.selectXuanByHid(hid);
        model.addAttribute("xuan",xuans1);
        Huati huati = service.selectByPrimaryKey(hid);
        model.addAttribute("huati",huati);
        return "index";
    }
    @RequestMapping("/dovote")
    public String dovote(Integer id){
        int dovote = xuanService.dovote(id);
        return "index";
    }
}
