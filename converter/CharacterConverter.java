package com.laptrinhjavaweb.converter;

import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.api.DTO.CharacterDTO;
import com.laptrinhjavaweb.entity.CharacterEntity;

@Component
public class CharacterConverter {
	public CharacterDTO toDTO(CharacterEntity entity) {
		CharacterDTO dto = new CharacterDTO();
		dto.setDescription(entity.getDescription());
		return dto;
	}
}
