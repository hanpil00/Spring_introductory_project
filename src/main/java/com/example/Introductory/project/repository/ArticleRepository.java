package com.example.Introductory.project.repository;

import com.example.Introductory.project.entity.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article, Long> {

}
