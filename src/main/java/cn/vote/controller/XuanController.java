package cn.vote.controller;

import cn.vote.pojo.Huati;
import cn.vote.pojo.Xuan;
import cn.vote.service.HuaTiService;
import cn.vote.service.XuanService;
import cn.vote.tools.XuanModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class XuanController {
    @Autowired
    XuanService xuanService;
    @Autowired
    HuaTiService service;
    @RequestMapping("/getxuan")
    @ResponseBody
    public Object getXuan(Integer hid){
        List<Xuan> xuans = xuanService.selectXuanByHid(hid);
        return xuans;
    }
    @RequestMapping(value = "/addxuan",method = RequestMethod.POST)
    public String addxuan(XuanModel xuanModel, HttpSession session){
        //使用集合封装多个选项对象
        List<Xuan> xuans =xuanModel.getXuans();

            for (Xuan xuan:xuans) {
                //循环添加选项数据
                System.out.println(xuan.toString());
                int insert = xuanService.insert(xuan);
            }
        //添加成功去投票页面查看
        int hid =xuans.get(0).getHid();
        List<Xuan> newXuans = xuanService.selectXuanByHid(hid);
        session.setAttribute("xuans",newXuans);
        Huati huati = service.selectByPrimaryKey(hid);
        session.setAttribute("huati",huati);
        return "redirect:/index";
    }

    @RequestMapping("/delxuan")
    @ResponseBody
    public String delxuan(Integer hid,Integer xid){
        int i=xuanService.deleteByhidAndxid(hid, xid);
        if (i>0){
            return "true";
        }
        return "false";
    }
}
