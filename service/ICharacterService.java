package com.laptrinhjavaweb.service;

import java.util.List;

import com.laptrinhjavaweb.api.DTO.CharacterDTO;

public interface ICharacterService {
	List<CharacterDTO> findAll();
}
