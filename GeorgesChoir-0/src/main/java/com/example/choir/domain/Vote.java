package com.example.choir.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Vote {
	private VoteId primkey;
	private Boolean upvote;
	
	@EmbeddedId
	public VoteId getPrimkey() {
		return primkey;
	}

	public void setPrimkey(VoteId primkey) {
		this.primkey = primkey;
	}

	public Boolean getUpvote() {
		return upvote;
	}

	public void setUpvote(Boolean upvote) {
		this.upvote = upvote;
	}

}
