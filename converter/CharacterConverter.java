package com.laptrinhjavaweb.converter;

import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.api.DTO.CharacterOutput;
import com.laptrinhjavaweb.entity.CharacterEntity;

@Component
public class CharacterConverter {
	public CharacterOutput toDTO(CharacterEntity entity) {
		CharacterOutput dto = new CharacterOutput();
		dto.setDescription(entity.getDescription());
		return dto;
	}
}
