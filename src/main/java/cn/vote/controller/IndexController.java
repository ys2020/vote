package cn.vote.controller;

import cn.vote.pojo.Huati;
import cn.vote.pojo.Xuan;
import cn.vote.service.HuaTiService;
import cn.vote.service.XuanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.Servlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class IndexController {
    @Autowired
    HuaTiService huaTiService;
    @Autowired
    XuanService xuanService;

    @RequestMapping(value = "/select/{hid}")
    public String tologin(HttpSession session,@PathVariable("hid") Integer hid){
        List<Xuan> xuans = xuanService.selectXuanByHid(hid);
        session.setAttribute("xuans",xuans);
        Huati huati = huaTiService.selectByPrimaryKey(hid);
        session.setAttribute("huati",huati);
        return "redirect:/index";
    }
    @RequestMapping("/huati")
    public String order(){
        return "huati";
    }
    @RequestMapping("/xuan")
    public String collection(){
        return "xuan";
    }
    @RequestMapping("/userinfo")
    public String shopcart(){
        return "user";
    }
    @RequestMapping("/index")
    public String pay(){
        return "index";
    }
//    @RequestMapping("/doindex")
//    public String success(Model model){
//
//        return "index";
//    }
}
