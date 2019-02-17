package com.example.choir.domain;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Comment {
	private CommentId primkey;
	private String text;
	
	@EmbeddedId
	public CommentId getPrimkey() {
		return primkey;
	}
	public void setPrimkey(CommentId primkey) {
		this.primkey = primkey;
	}
	@Column(length=5000)
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}

}
