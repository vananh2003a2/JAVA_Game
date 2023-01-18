package com.laptrinhjavaweb.service;

import java.util.List;

import com.laptrinhjavaweb.api.DTO.ExploreDTO;

public interface IExploreService {
	List<ExploreDTO> findAll();
}
