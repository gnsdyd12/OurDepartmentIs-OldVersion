package com.example.project4_1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class postController {

//    @GetMapping("hello")
//    public String hello(Model model){
//        model.addAttribute("data","hello!!");
//        return "hello";
//    }

    @GetMapping("index")
    public String index(Model model){
        model.addAttribute("data","hello!!");
        return "index";
    }

    @GetMapping("write_post")
    public String writePost(Model model){
        model.addAttribute("data","hello!!");
        return "write_post";
    }
}
