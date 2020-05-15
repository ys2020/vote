package cn.vote.controller;


import cn.vote.pojo.User;
import cn.vote.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegisterController {
    @Autowired
    private UserService userService;

    @RequestMapping("/register")
    public String toregister() {
        return "register";
    }

    @RequestMapping(value = "/doregister", method = RequestMethod.POST)
    public String register(@RequestParam(value = "username") String username,
                         @RequestParam(value = "password") String password) {

        User user = new User(username,password);
            int insert = userService.insert(user);
            if (insert>0){
                return "redirect:/login.html";
            }
            return "register";
    }
}
