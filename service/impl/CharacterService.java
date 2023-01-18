package com.laptrinhjavaweb.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laptrinhjavaweb.api.DTO.CharacterDTO;
import com.laptrinhjavaweb.converter.CharacterConverter;
import com.laptrinhjavaweb.entity.CharacterEntity;
import com.laptrinhjavaweb.repository.CharacterRepository;
import com.laptrinhjavaweb.service.ICharacterService;

@Service
public class CharacterService implements ICharacterService {
	@Autowired
	private CharacterConverter characterConverter;
	@Autowired
	private CharacterRepository characterRepository;
	@Override
	public List<CharacterDTO> findAll() {
		List<CharacterDTO> results = new ArrayList<>();
		List<CharacterEntity> entities = characterRepository.findAll();
		for (CharacterEntity item : entities) {
			CharacterDTO characterOutput = characterConverter.toDTO(item);
			results.add(characterOutput);
		}
		return results;
	}
	

}