package com.example.hellospringboot.service;

import com.example.hellospringboot.entity.Article;

import java.util.List;

public interface ArticleService {

    List <Article> queryArticleByUsername(String username);

    List <Article> queryAllArticle();

    int addArticle(Article article);

    int delUser(int articleId);

    int updateUser(Article article);
}

