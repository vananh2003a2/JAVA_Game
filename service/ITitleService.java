package com.laptrinhjavaweb.service;

import java.util.List;

import com.laptrinhjavaweb.api.DTO.TitleDTO;

public interface ITitleService {
	List<TitleDTO> findAll();
}
