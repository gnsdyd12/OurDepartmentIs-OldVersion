package com.example.project4_1;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //id 자동증가
    private Long id;
    @Column
    @NotNull
    private String title;
    @Column
    @NotNull
    private String contents;
    @Column
    private LocalDateTime create_time = LocalDateTime.now();

    public Post() {

    }

    public Post(PostDto.PostSaveDto postSaveDto) {
        this.id=-1l;
        this.title = postSaveDto.getTitle();
        this.contents = postSaveDto.getContents();
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

    public LocalDateTime getCreate_time() {
        return create_time;
    }

    public void setCreate_time(LocalDateTime create_time) {
        this.create_time = create_time;
    }
}
