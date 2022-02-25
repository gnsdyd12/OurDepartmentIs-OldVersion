package com.example.project4_1;

import java.sql.Timestamp;

public class PostDto {
    public static class PostSaveDto {
        private String title;
        private String contents;

        public PostSaveDto(String title, String contents) {
            this.title = title;
            this.contents = contents;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContents() {
            return contents;
        }

        public void setContents(String contents) {
            this.contents = contents;
        }
    }

    public static class PostListDtd{
        private Long id;
        private String title;
        private String contents;

        public PostListDtd(Long id, String title, String contents) {
            this.id = id;
            this.title = title;
            this.contents = contents;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContents() {
            return contents;
        }

        public void setContents(String contents) {
            this.contents = contents;
        }
    }
}
