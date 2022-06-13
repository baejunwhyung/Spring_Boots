package com.example.firstproject.controller;


import com.example.firstproject.Repository.ArticleRepository;
import com.example.firstproject.dto.ArticleForm;
import com.example.firstproject.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {
    @Autowired
    private ArticleRepository articleRepository;
    @GetMapping("/articles/new")
    public String newArticlesForm(){
        return "articles/new";
    }

    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form){
        System.out.println(form.toString());

        //1. Dto를 변환 > Entity로!
        Article article=form.toEntity();
        System.out.println(article.toString());


        //2. Repository에게 Entity를 DB안에 저장하게 한다
        Article saved= articleRepository.save(article);
        System.out.println(saved.toString());
        return "";
    }
}

