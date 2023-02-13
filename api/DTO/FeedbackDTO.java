package com.laptrinhjavaweb.api.DTO;

import java.util.Date;

public class FeedbackDTO {
	private String fullName;
	private String content;
	private int star;
	private String time;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTime() {
		return time;
	}

	public void setTime(long longtime) {
		Date date= new Date(longtime);
		this.time = date.toString();
	}

	public int getStar() {
		return star;
	}

	public void setStar(int star) {
		this.star = star;
	}

}
