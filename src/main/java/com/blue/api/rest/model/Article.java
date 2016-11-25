package com.blue.api.rest.model;

import java.util.Date;
import java.util.List;

public class Article {

	private String id;
	private String title;
	private Date date;
	private String body;
	private List<String> tags;

	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getBody() {
		return body;
	}


	public void setBody(String body) {
		this.body = body;
	}


	public List<String> getTags() {
		return tags;
	}


	public void setTags(List<String> tags) {
		this.tags = tags;
	}


	public Article(String id, String title, Date date, String body, List<String> tags
			) {
		super();
		this.id = id;
		this.title = title;
		this.date = date;
		this.body = body;
		this.tags = tags;
	}
	
	public Article (){}
	
	
}
