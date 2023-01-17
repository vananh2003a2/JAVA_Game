package com.laptrinhjavaweb.converter;

import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.api.DTO.AboutOutput;
import com.laptrinhjavaweb.entity.ContentEntity;
import com.laptrinhjavaweb.entity.TitleEntity;

@Component
public class AboutConverter {
	public AboutOutput toDTO(TitleEntity entity1, ContentEntity entity2) {
		AboutOutput dto = new AboutOutput();
		dto.setTitleName(entity1.getTitleName());
		dto.setContentDetails(entity2.getContentDetails());
		return dto;
	}
}
