package com.example.project4_1.mypage.temporaryPost;

import com.example.project4_1.SessionUser;
import lombok.RequiredArgsConstructor;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequiredArgsConstructor
public class TemporaryPostController {
    final TemporaryPostService temporaryPostService;
    private final HttpSession httpSession;
    @GetMapping("/temporaryPost")
    public ModelAndView temporaryPost(ModelAndView modelAndView){
        SessionUser user = (SessionUser) httpSession.getAttribute("user");
        modelAndView.addObject("tempPost",temporaryPostService.findByWriter());
        modelAndView.setViewName("/mypage/temporary_post");
        return modelAndView;
    }

    @PostMapping("/temporaryPost")
    public String temporaryPost_save(TemporaryPostDto.TemporaryPostSaveDto temporaryPostSaveDto){
        temporaryPostService.temporaryPostSave(new TemporaryPost(temporaryPostSaveDto));
        return "redirect:/";
    }

}
