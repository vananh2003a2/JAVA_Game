package com.laptrinhjavaweb.api.DTO;

import java.util.Date;

public class FeedbackDTO extends AbstractDTO {
	private String content;
	private Date time;
	private int star;
	private String emailUser;
	private UserDTO user;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public int getStar() {
		return star;
	}

	public void setStar(int star) {
		this.star = star;
	}

	public String getEmailUser() {
		return emailUser;
	}

	public void setEmailUser(String emailUser) {
		this.emailUser = emailUser;
	}

	public UserDTO getUserDTO() {
		return user;
	}

	public void setUserDTO(UserDTO userDTO) {
		this.user = userDTO;
	}
}