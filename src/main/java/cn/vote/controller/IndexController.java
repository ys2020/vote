package cn.vote.controller;

import org.springframework.stereotype.Controller;
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
//    @RequestMapping("/login")
//    public String pay(){
//        return "login";
//    }
    @RequestMapping("/success")
    public String success(){
        return "home/success";
    }
}
