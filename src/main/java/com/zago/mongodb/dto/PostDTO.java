package com.zago.mongodb.dto;

import java.util.Date;

import com.zago.mongodb.domain.Post;

public class PostDTO {

	private String id;
	private Date date;
	private String title;
	private String body;
	private AuthorDTO author;

	public PostDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public PostDTO(Post post) {
		this.id = post.getId();
		this.date = post.getDate();
		this.title = post.getTitle();
		this.body = post.getBody();
		this.author = post.getAuthor();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public AuthorDTO getAuthor() {
		return author;
	}

	public void setAuthor(AuthorDTO author) {
		this.author = author;
	}

}
