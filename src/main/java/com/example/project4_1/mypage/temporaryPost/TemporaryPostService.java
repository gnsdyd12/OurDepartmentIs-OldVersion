package com.example.project4_1.mypage.temporaryPost;

import com.example.project4_1.SessionUser;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Optional;

@Service
public class TemporaryPostService {
    private final TemporaryPostRepository temporaryPostRepository;
    private final HttpSession httpSession;

    public TemporaryPostService(TemporaryPostRepository temporaryPostRepository, HttpSession httpSession) {
        this.temporaryPostRepository = temporaryPostRepository;
        this.httpSession = httpSession;
    }

    public void temporaryPostSave(TemporaryPost temporaryPost){
        temporaryPostRepository.save(temporaryPost);
    }

    public Optional<List<TemporaryPostDto.TemporaryPostListDto>> findByWriter(){
        SessionUser user = (SessionUser) httpSession.getAttribute("user");
        return temporaryPostRepository.findByWriter(user.getName());
    }
}
