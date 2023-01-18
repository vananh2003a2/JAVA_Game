package com.laptrinhjavaweb.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laptrinhjavaweb.api.DTO.ExploreDTO;
import com.laptrinhjavaweb.converter.ExploreConverter;
import com.laptrinhjavaweb.entity.ExploreEntity;
import com.laptrinhjavaweb.repository.ExploreRepository;
import com.laptrinhjavaweb.service.IExploreService;

@Service
public class ExploreService implements IExploreService {
	@Autowired
	private ExploreRepository exploreRepository;

	@Autowired
	private ExploreConverter exploreConverter;

	@Override
	public List<ExploreDTO> findAll() {
		List<ExploreDTO> results = new ArrayList<>();
		List<ExploreEntity> entities = exploreRepository.findAll();
		for (ExploreEntity item : entities) {
			ExploreDTO exploreOutput = exploreConverter.toDTO(item);
			results.add(exploreOutput);
		}
		return results;
	}
}
