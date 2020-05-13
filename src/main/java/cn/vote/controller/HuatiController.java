package cn.vote.controller;

import cn.vote.pojo.Huati;
import cn.vote.service.HuaTiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HuatiController {
    @Autowired
    HuaTiService huaTiService;
    @RequestMapping("/guanli")
    public String gethuaTi(Model model){
        List<Huati> huati = huaTiService.getHuati();
        model.addAttribute("huati",huati);
        return "guanli";
    }
}
