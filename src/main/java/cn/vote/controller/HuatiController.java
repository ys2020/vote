package cn.vote.controller;

import cn.vote.pojo.Huati;
import cn.vote.service.HuaTiService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class HuatiController {
    @Autowired
    HuaTiService huaTiService;
    @RequestMapping("/tongji")
    public String gethuaTi(Model model){
        List<Huati> huati = huaTiService.getHuati();
        model.addAttribute("hua",huati);
        return "tongji";
    }
    @RequestMapping("/guanli")
    public String toguanli(Model model){
        List<Huati> huati = huaTiService.getHuati();
        model.addAttribute("ht",huati);
        return "guanli";
    }
    @RequestMapping(value = "/addhuati",method = RequestMethod.POST)
    public String addhuati(Huati huati, Model model){
        //添加话题
        int result = huaTiService.insert(huati);
        //添加成功
        if (result>0){
            //添加完成找到刚刚的对象
            Huati hua = huaTiService.selectByUidAndHname(huati.getUid(), huati.getHname());
            //将刚添加的话题对象传给选项页面
            model.addAttribute("huati",hua);
            return "xuan";
        }
        //失败返回添加话题页面
        return "huati";
    }
}
