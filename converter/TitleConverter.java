package com.laptrinhjavaweb.converter;

import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.api.DTO.TitleDTO;
import com.laptrinhjavaweb.entity.TitleEntity;

@Component
public class TitleConverter {
	public TitleDTO toDTO(TitleEntity entity) {
		TitleDTO dto = new TitleDTO();
		dto.setId(entity.getId());
		dto.setNameTitle(entity.getTitleName());
		return dto;
	}
}
