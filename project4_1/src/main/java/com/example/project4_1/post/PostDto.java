package com.example.project4_1.post;

public class PostDto {
    public static class PostSaveDto {
        private String title;
        private String contents;
        private String writer;


        public PostSaveDto(String title, String contents, String writer) {
            this.title = title;
            this.contents = contents;
            this.writer = writer;
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

        public String getWriter() {
            return writer;
        }

        public void setWriter(String writer) {
            this.writer = writer;
        }
    }

    public static class PostListDto {
        private Long id;
        private String title;
        private String contents;
        private String writer;


        public PostListDto(Long id, String title, String contents, String writer) {
            this.id = id;
            this.title = title;
            this.contents = contents;
            this.writer = writer;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getWriter() {
            return writer;
        }

        public void setWriter(String writer) {
            this.writer = writer;
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
    public static class PostDetailDto{
        private Long id;
        private String title="";
        private String contents="";
        private String writer="";
        private Long views=0L;

        public PostDetailDto(Long id, String title, String contents, String writer, Long views) {
            this.id = id;
            this.title = title;
            this.contents = contents;
            this.writer = writer;
            this.views = views;
        }

        public PostDetailDto(Post post){
            this.id= post.getId();
            this.title = post.getTitle();
            this.contents = post.getContents();
            this.writer = post.getWriter();
            this.views = post.getViews();
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

        public String getWriter() {
            return writer;
        }

        public void setWriter(String writer) {
            this.writer = writer;
        }

        public Long getViews() {
            return views;
        }

        public void setViews(Long views) {
            this.views = views;
        }
    }
}
