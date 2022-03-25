package com.example.project4_1.post;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class postController {

    final PostService postService;

    public postController(PostService postService) {
        this.postService = postService;
    }
    //write 데이터 처리(post mapping)
    @PostMapping("/postdata")
    public String savePost(PostDto.PostSaveDto postSaveDto) {
        postService.save(new Post(postSaveDto));
        return "redirect:/";
    }
    //list page
    @RequestMapping(value = "/", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView index(ModelAndView modelAndView) {
        modelAndView.addObject("post",postService.findByAll());
        modelAndView.setViewName("index");
        return modelAndView;
    }

    //write 페이지
    @GetMapping("write_post")
    public String writePost(ModelAndView modelAndView) {
        //model.addAttribute("data","hello!!");
        return "post/write_post";
    }
    //게시글 본문
    @GetMapping("view_post/{id}")
    public ModelAndView viewpost(@PathVariable Long id){
        Optional<PostDto.PostDetailDto> post = postService.findById(id);
        postService.view_Count(id);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("post",post.get());
        modelAndView.setViewName("post/view_post");
        return modelAndView;
    }

}
