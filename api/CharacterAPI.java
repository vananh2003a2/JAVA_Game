package com.laptrinhjavaweb.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laptrinhjavaweb.output.CharacterOutput;
import com.laptrinhjavaweb.service.ICharacterService;

@RestController
public class CharacterAPI {
	@Autowired
	private ICharacterService characterService;

	@GetMapping(value = "/character")
	public CharacterOutput showCharacter() {
		CharacterOutput result = new CharacterOutput();
		result.setListResult(characterService.findAll());
		return result;
	}
}
