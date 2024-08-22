package com.trg.boot.auth;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Author {
	@Id
	private int authorId;
	private String name;
	private String subject;
	
	public Author() {
		super();
	}
	public Author(int authorId, String name, String subject) {
		super();
		this.authorId = authorId;
		this.name = name;
		this.subject = subject;

	}
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
	

}
