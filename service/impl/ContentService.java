package com.laptrinhjavaweb.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laptrinhjavaweb.output.ContentOutput;
import com.laptrinhjavaweb.converter.ContentConverter;
import com.laptrinhjavaweb.entity.ContentEntity;
import com.laptrinhjavaweb.repository.ContentRepository;
import com.laptrinhjavaweb.service.IContentService;

@Service
public class ContentService implements IContentService {
	@Autowired
	private ContentRepository contentRepository;	
	@Autowired
	private ContentConverter contentConverter;

	@Override
	public List<ContentOutput> findAll() {
		List<ContentOutput> results = new ArrayList<>();
		List<ContentEntity> entities = contentRepository.findAll();
		for (ContentEntity item : entities) {
			ContentOutput contentOutput = contentConverter.toDTO(item);
			results.add(contentOutput);
		}
		return results;
	}
}
