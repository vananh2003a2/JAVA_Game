package com.laptrinhjavaweb.output;

import com.laptrinhjavaweb.api.DTO.AbstractDTO;
import com.laptrinhjavaweb.api.DTO.TitleDTO;

public class ContentOutput extends AbstractDTO{
	private String contentDetails;
	private TitleDTO title;

	public TitleDTO getTitle() {
		return title;
	}

	public void setTitle(TitleDTO title) {
		this.title = title;
	}

	public String getContentDetails() {
		return contentDetails;
	}

	public void setContentDetails(String contentDetails) {
		this.contentDetails = contentDetails;
	}
	
}
