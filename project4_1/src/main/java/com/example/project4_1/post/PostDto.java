package com.example.project4_1.post;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

public class PostDto {
    @Getter
    @Setter
    @AllArgsConstructor
    public static class PostSaveDto {
        private String title;
        private String contents;
        private String writer;

    }

    @Getter
    @Setter
    @AllArgsConstructor
    public static class PostListDto {
        private Long id;
        private String title;
        private String contents;
        private String writer;

    }
    @Getter
    @Setter
    @AllArgsConstructor
    public static class PostDetailDto{
        private Long id;
        private String title="";
        private String contents="";
        private String writer="";
        private Long views=0L;


        public PostDetailDto(Post post){
            this.id= post.getId();
            this.title = post.getTitle();
            this.contents = post.getContents();
            this.writer = post.getWriter();
            this.views = post.getViews();
        }

    }
}