package com.example.project4_1.mypage.temporaryPost;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class TemporaryPostDto {
    @Getter
    @Setter
    @AllArgsConstructor
    public static class TemporaryPostSaveDto {
        private String title;
        private String contents;
        private String writer;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    public static class TemporaryPostListDto {
        private Long id;
        private String title;
        private String contents;
        private String writer;
    }

}
