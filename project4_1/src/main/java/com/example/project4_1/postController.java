package com.example.project4_1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class postController {

    final PostService postService;

    public postController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping("/postdata")
    public String savePost(PostDto.PostSaveDto postSaveDto) {
        postService.save(new Post(postSaveDto));
        return "redirect:/";
    }

    @RequestMapping(value = "/", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView index(ModelAndView modelAndView) {
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @GetMapping("write_post")
    public String writePost(ModelAndView modelAndView) {
        //model.addAttribute("data","hello!!");
        return "write_post";
    }


}
