package com.laptrinhjavaweb.converter;

import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.api.DTO.ExploreOutput;
import com.laptrinhjavaweb.entity.ExploreEntity;

@Component
public class ExploreConverter {
	public ExploreOutput toDTO(ExploreEntity entity) {
		ExploreOutput dto = new ExploreOutput();
		dto.setContentExplore(entity.getContentExplore());
		return dto;
	}
}
