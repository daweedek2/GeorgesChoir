package com.example.choir.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class VoteId implements Serializable {
	private static final long serialVersionUID = 6205628505217349426L;
	private Users user;
	private Feature feature;
	
	@ManyToOne
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	
	@ManyToOne
	public Feature getFeature() {
		return feature;
	}
	public void setFeature(Feature feature) {
		this.feature = feature;
	}
}
