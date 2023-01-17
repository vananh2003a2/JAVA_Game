package com.laptrinhjavaweb.converter;

import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.api.DTO.UserInput;
import com.laptrinhjavaweb.entity.UserEntity;

@Component
public class UserConverter {
	public UserEntity toEntity(UserInput input) {
		UserEntity entity = new UserEntity();
		entity.setFullName(input.getFullName());
		entity.setEmail(input.getEmail());
		entity.setPhone(input.getPhone());
		return entity;
	}
	
	public UserInput toDTO(UserEntity entity) {
		UserInput dto = new UserInput();
		dto.setFullName(entity.getFullName());
		dto.setEmail(entity.getEmail());
		dto.setPhone(entity.getPhone());
		dto.setId(entity.getId());
		return dto;
	}
}
