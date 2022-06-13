package com.example.firstproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity //DB가 해당 객체 인식 가능
public class Article {

    @Id  //대표값을 지정   주민등록번호처럼
    @GeneratedValue //1,2,3,.... 자동 생성 어노테이션
    private Long ID;
    @Column
    private String title;
    @Column
    private String content;

    public Article(Long ID, String title, String content) {
        this.ID = ID;
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Article{" +
                "ID=" + ID +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
