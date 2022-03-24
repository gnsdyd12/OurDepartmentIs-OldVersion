package com.example.project4_1.member;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {

    private final PasswordEncoder passwordEncoder;
    private final MemberRepository memberRepository;

    @GetMapping("/list")
    public String mainPage(Map<String, Object> model){
        List<Member> members = memberRepository.findAll();
        model.put("members", members);
        return "memberList";
    }

    @GetMapping("/admin")
    public String adminPage(Map<String, Object> model){
        return "adminPage";
    }

    @GetMapping("/newMember")
    public String memberJoinForm(Member memberFrom){
        return "memberJoinForm";
    }
    @PostMapping("/newMember")
    public String memberJoin(Member memberForm) {
        memberForm.setPassword(passwordEncoder.encode(memberForm.getPassword()));// password 암호화
        memberRepository.save(memberForm);
        return "redirect:/login";
    }
}
