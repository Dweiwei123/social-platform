package com.example.hellospringboot.service.impl;

import com.example.hellospringboot.entity.Article;
import com.example.hellospringboot.mapper.ArticleMapper;
import com.example.hellospringboot.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    public List<Article> queryArticleByUsername(String username){
        return articleMapper.queryArticleByUsername(username);
    }

    public List <Article> queryAllArticle(){
        return articleMapper.queryAllArticle();
    }

    public int addArticle(Article article){
        return articleMapper.addArticle(article);
    }

    public int delUser(int articleId){
        return articleMapper.delArticle(articleId);
    }

    public int updateUser(Article article){
        return articleMapper.updateArticle(article);
    }
}

