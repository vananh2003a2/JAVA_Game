package com.laptrinhjavaweb.converter;



import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.api.DTO.FeedbackInput;
import com.laptrinhjavaweb.entity.FeedbackEntity;

@Component
//de co the nhung converter vao service
//convert DTO thanh Entity de luu xuong db
public class FeedbackConverter {
	public FeedbackEntity toEntity(FeedbackInput input) {
		FeedbackEntity entity = new FeedbackEntity();
		entity.setContent(input.getContent());
		entity.setStar(input.getStar());
		return entity;
	}

	public FeedbackInput toDTO(FeedbackEntity entity) {
		FeedbackInput dto = new FeedbackInput();
		dto.setContent(entity.getContent());
		dto.setStar(entity.getStar());
		dto.setId(entity.getId());
		dto.setTime(entity.getTime());
		return dto;
	}
}
