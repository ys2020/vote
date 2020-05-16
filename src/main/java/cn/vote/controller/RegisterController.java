package cn.vote.controller;


import cn.vote.pojo.User;
import cn.vote.service.UserService;
import cn.vote.tools.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class RegisterController {
    @Autowired
    private UserService userService;

    @RequestMapping("/register")
    public String toregister() {
        return "register";
    }

    @RequestMapping(value = "/doregister", method = RequestMethod.POST)
    public String register(@RequestParam(value = "uname") String username,
                           @RequestParam(value = "password") String password, HttpSession session) {

        User user = new User(username,password);
            int insert = userService.insert(user);
            if (insert>0){
                session.setAttribute(Constants.USER_SESSION, user);
                return "redirect:/userinfo";
            }
            return "register";
    }
}
