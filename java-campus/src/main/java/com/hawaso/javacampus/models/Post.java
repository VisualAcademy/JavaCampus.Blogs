package com.hawaso.javacampus.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

// Post 모델 클래스: Posts 테이블과 일대일로 매핑
@Entity(name = "Posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;
    private String content; 

    @ManyToOne
    @JoinColumn(name = "BlogId")
    private Blog blog; 

    public Post() {
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Post(String title, String content) {
        this.setTitle(title);
        this.setContent(content);
    }
}
