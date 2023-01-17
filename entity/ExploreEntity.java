package com.laptrinhjavaweb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "explore")
public class ExploreEntity extends BaseEntity {

	@Column(name = "contentexplore")
	private String contentExplore;

	public String getContentExplore() {
		return contentExplore;
	}

	public void setContentExplore(String contentExplore) {
		this.contentExplore = contentExplore;
	}
	
}
