package cn.vote.controller;


import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
public class RegisterController {
//    @Autowired
//    private ShopUserService ss;
//    @RequestMapping("register")
//    public String toregister(){
//        return "register";
//    }
//
//    @RequestMapping(value = "/doregister",method = RequestMethod.POST)
//    public String register(@RequestParam(value = "email",defaultValue ="") String email, @RequestParam(value = "username")String username,
//                             @RequestParam(value = "password")String password,
//                             @RequestParam(value = "phone",defaultValue ="") String phone) {
//
//            ShopUser su =new ShopUser(username,password,email.toLowerCase(),phone);
//            int insert = ss.insert(su);
//            if (insert>0){
//                return "redirect:/login.html";
//            }
//            return "register";
//        }
}
