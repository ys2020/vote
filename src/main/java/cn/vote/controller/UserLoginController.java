package cn.vote.controller;


import cn.vote.tools.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class UserLoginController {

//    @Autowired
//    private ShopUserService shopUserService;
//
//    // 去登陆页面
//    @RequestMapping(value={"/","/login.html"},method = RequestMethod.GET)
//    public String toLogin(){
//        return "login";
//    }
//
//    @RequestMapping(value="/dologin",method = RequestMethod.POST)
//    public String doLogin(ShopUser user, HttpSession session){
//        ShopUser devUser = shopUserService.login(user);
//        if (devUser == null) {
//            return "redirect:/login.html";
//        }
//        session.setAttribute(Constants.USER_SESSION, devUser);
//        return "home";
//    }
//    @RequestMapping(value="/logout",method = RequestMethod.GET)
//    public String doLogout(HttpSession session){
//        session.invalidate();
//        return "redirect:/index";
//    }



}
