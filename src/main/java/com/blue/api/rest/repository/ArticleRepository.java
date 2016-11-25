package com.blue.api.rest.repository;

import java.util.List;

import com.blue.api.rest.model.Article;


/**
 * @author Sriram Puvvada
 */
public interface ArticleRepository {

    
	
    public Article findById(String id);


    public List<Article> getAllArticles();


    public void save(Article article);


    public void delete(String id);
}
