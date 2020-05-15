package cn.vote.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping("/index")
    public String tologin(){
        return "index";
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
//    @RequestMapping("/tongji")
//    public String pay(){
//        return "tongji";
//    }
//    @RequestMapping("/doindex")
//    public String success(Model model){
//
//        return "index";
//    }
}
