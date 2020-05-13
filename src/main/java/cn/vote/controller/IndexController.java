package cn.vote.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping("/index")
    public String tologin(){
        return "user";
    }
    @RequestMapping("/huati")
    public String order(){
        return "huati";
    }
    @RequestMapping("/xuan")
    public String collection(){
        return "xuan";
    }
    @RequestMapping("/guanli")
    public String shopcart(){
        return "guanli";
    }
    @RequestMapping("/tongji")
    public String introduction(){
        return "tongji";
    }
    @RequestMapping("/pay")
    public String pay(){
        return "home/pay";
    }
    @RequestMapping("/success")
    public String success(){
        return "home/success";
    }
}
