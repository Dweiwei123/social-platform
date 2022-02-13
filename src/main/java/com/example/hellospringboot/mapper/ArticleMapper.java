package com.example.hellospringboot.mapper;

import com.example.hellospringboot.entity.Article;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

//mybatis的mapper类：Dao
//需要用到sql语句的方法
@Mapper
@Repository
public interface ArticleMapper {

    List <Article> queryArticleByUsername(String username);

    List <Article> queryAllArticle();

    int addArticle(Article article);

    int delArticle(int articleId);

    int updateArticle(Article article);
}
