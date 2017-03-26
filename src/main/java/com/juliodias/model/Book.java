package com.juliodias.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Book {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String title;
	private String author;
	private Integer score;
	private String comment;
	
	public Book(String title, String author, Integer score, String comment) {
		this.title = title;
		this.author = author;
		this.score = score;
		this.comment = comment;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public Integer getScore() {
		return score;
	}

	public String getComment() {
		return comment;
	}
	
}
