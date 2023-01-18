package com.laptrinhjavaweb.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laptrinhjavaweb.api.DTO.TitleDTO;
import com.laptrinhjavaweb.converter.TitleConverter;
import com.laptrinhjavaweb.entity.TitleEntity;
import com.laptrinhjavaweb.repository.TitleRepository;
import com.laptrinhjavaweb.service.ITitleService;

@Service
public class TitleService implements ITitleService{
@Autowired
private TitleRepository titleRepository;
@Autowired 
private TitleConverter titleConverter;
@Override
public List<TitleDTO> findAll(){
	List<TitleDTO> results = new ArrayList<>();
	List<TitleEntity> entities = titleRepository.findAll();
	for (TitleEntity item : entities) {
		TitleDTO titleOutput = titleConverter.toDTO(item);
		results.add(titleOutput);
	}
	return results;
}

}
