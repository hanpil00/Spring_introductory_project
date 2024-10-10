package com.example.Introductory.project.controller;

import com.example.Introductory.project.dto.ArticleForm;
import com.example.Introductory.project.entity.Article;
import com.example.Introductory.project.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {
    @Autowired
    private ArticleRepository articleRepository;

    @GetMapping("/articles/input")
    public String inputForm(){
        return "articles/input";
    }

    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form){
        System.out.println(form.toString());

        Article article = form.toEntity();
        System.out.println(article.toString());

        Article saved = articleRepository.save(article);
        System.out.println(saved.toString());

        return "";
    }
}
