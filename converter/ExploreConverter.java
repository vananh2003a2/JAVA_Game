package com.laptrinhjavaweb.converter;

import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.api.DTO.ExploreDTO;
import com.laptrinhjavaweb.entity.ExploreEntity;

@Component
public class ExploreConverter {
	public ExploreDTO toDTO(ExploreEntity entity) {
		ExploreDTO dto = new ExploreDTO();
		dto.setContentExplore(entity.getContentExplore());
		return dto;
	}
}
