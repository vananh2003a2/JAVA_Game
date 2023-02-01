package com.laptrinhjavaweb.converter;

import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.entity.ContentEntity;
import com.laptrinhjavaweb.output.ContentOutput;

@Component
public class ContentConverter {


	public ContentOutput toDTO(ContentEntity entity) {
		ContentOutput dto = new ContentOutput();
		dto.setContentDetails(entity.getContentDetails());
		dto.setTitle(entity.getTitleName());
		return dto;
	}
}
