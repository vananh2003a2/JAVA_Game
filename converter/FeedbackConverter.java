package com.laptrinhjavaweb.converter;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.api.DTO.FeedbackDTO;
import com.laptrinhjavaweb.api.DTO.FeedbackInput;
import com.laptrinhjavaweb.api.DTO.UserDTO;
import com.laptrinhjavaweb.entity.FeedbackEntity;
import com.laptrinhjavaweb.output.FeedbackOutput;

@Component
//de co the nhung converter vao service
//convert DTO thanh Entity de luu xuong db
public class FeedbackConverter {
	@Autowired
	private UserConverter userConverter;
	public FeedbackEntity toEntity(FeedbackInput input) {
		FeedbackEntity entity = new FeedbackEntity();
		entity.setContent(input.getContent());
		entity.setStar(input.getStar());
		return entity;
	}

	public FeedbackDTO toDTO(FeedbackEntity entity) {
		FeedbackDTO dto = new FeedbackDTO();
		dto.setContent(entity.getContent());
		dto.setStar(entity.getStar());
		dto.setId(entity.getId());
		dto.setTime(entity.getTime());
		UserDTO userDTO = userConverter.toDTO(entity.getUser());
		dto.setUserDTO(userDTO);
		return dto;
	}
	public FeedbackOutput converterShow(FeedbackEntity entity) {
		FeedbackOutput dto = new FeedbackOutput();
		dto.setContent(entity.getContent());
		dto.setStar(entity.getStar());
		UserDTO userDTO = userConverter.toDTO(entity.getUser());
		dto.setFullName(userDTO.getFullName());
		return dto;
	}
}
