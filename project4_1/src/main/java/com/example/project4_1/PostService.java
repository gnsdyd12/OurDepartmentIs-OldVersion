package com.example.project4_1;

import org.springframework.stereotype.Service;

@Service
public class PostService {

    private final PostRepo postRepo;

    public PostService(PostRepo postRepo) {
        this.postRepo = postRepo;
    }

    public void save(Post post){
        postRepo.save(post);
    }
}
