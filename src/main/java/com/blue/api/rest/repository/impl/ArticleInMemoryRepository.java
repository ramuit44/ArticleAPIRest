package com.blue.api.rest.repository.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

import com.blue.api.rest.model.Article;
import com.blue.api.rest.model.ArticleIdentifier;
import com.blue.api.rest.repository.ArticleRepository;


/**
 * @author Sriram Puvvada
 */
@Repository
class ArticleInMemoryRepository implements ArticleRepository {

    private final List<Article> articles = new ArrayList<Article>();


    public ArticleInMemoryRepository() {

    	articles.add(new Article(ArticleIdentifier.next().getNumber(), 
    			"latest science shows that potato chips are better for you than sugar",
    			new Date(),
    			"some text, potentially containing simple markup about how potato chips are great"
    			,
    			new ArrayList<String>(){{
    				   add("health");
    				   add("fitness");
    				   add("science");
    				}}
    			));
    }


    @Override
    public Article findById(String number) {

        if (number == null) {
            return null;
        }

        for (Article article : articles) {
            if (number.equals(article.getId())) {
                return article;
            }
        }

        return null;
    }


    @Override
    public List<Article> getAllArticles() {

        return Collections.unmodifiableList(articles);
    }


    @Override
    public void save(Article article) {

        Assert.notNull(article);

        if (article.getId() == null || article.getId().isEmpty()) {

            article.setId(ArticleIdentifier.next().getNumber());
            articles.add(article);
        } else {

        	Article original = findById(article.getId());
        	original.setBody(article.getBody());
        	original.setDate(article.getDate());
        	original.setTags(article.getTags());
        	original.setTitle(article.getTitle());
        }
    }


    @Override
    public void delete(String id) {

    	Article article = findById(id);

        if (article != null) {
        	articles.remove(article);
        }
    }


	

	
}
