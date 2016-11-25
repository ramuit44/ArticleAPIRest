package com.blue.api.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.blue.api.rest.model.Article;
import com.blue.api.rest.repository.ArticleRepository;

/**
 * @author Sriram Puvvada
 */
@RestController
class ArticleController {

	private final ArticleRepository repository;

	@Autowired
	public ArticleController(ArticleRepository repository) {

		Assert.notNull(repository);
		this.repository = repository;
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	   public String index() {
		   return "index.html";
	}
	
	
	@RequestMapping(value = "/articles", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Article> getArticles() {
		List<Article> articles = repository.getAllArticles();
		return articles;
	}

	@RequestMapping(value = "/articles", method = RequestMethod.POST, headers = "Accept=application/json")
	public List<Article> addCountry(@RequestBody Article article) {
		repository.save(article);
		return repository.getAllArticles();
	}

	@RequestMapping(value = "/articles/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Article getArticleById(@PathVariable String id) {
		return repository.findById(id);
	}

	@RequestMapping(value = "/articles", method = RequestMethod.PUT, headers = "Accept=application/json")
	public List<Article> updateArticle(@RequestBody Article article) {
		repository.save(article);
		return repository.getAllArticles();

	}

	@RequestMapping(value = "/articles/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteCountry(@PathVariable("id") String id) {
		repository.delete(id);

	}

}
