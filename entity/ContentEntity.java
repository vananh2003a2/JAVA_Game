package com.laptrinhjavaweb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "contentTitle")
public class ContentEntity extends BaseEntity{

	@Column(name = "contentdetails")
	private String contentDetails;
	
	@OneToOne
    @JoinColumn(name = "title_id")
    private TitleEntity title;

	public String getContentDetails() {
		return contentDetails;
	}

	public void setContentDetails(String contentDetails) {
		this.contentDetails = contentDetails;
	}

	public TitleEntity getTitle() {
		return title;
	}

	public void setTitle(TitleEntity title) {
		this.title = title;
	}
	
}
