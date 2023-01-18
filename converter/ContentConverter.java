package com.laptrinhjavaweb.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.output.ContentOutput;
import com.laptrinhjavaweb.api.DTO.TitleDTO;
import com.laptrinhjavaweb.entity.ContentEntity;

@Component
public class ContentConverter {
	@Autowired
	private TitleConverter titleConverter;

	public ContentOutput toDTO(ContentEntity entity) {
		ContentOutput dto = new ContentOutput();
		dto.setId(entity.getId());
		dto.setContentDetails(entity.getContentDetails());
		TitleDTO titleDTO = titleConverter.toDTO(entity.getTitle());
		dto.setTitle(titleDTO);
		return dto;
	}
}
