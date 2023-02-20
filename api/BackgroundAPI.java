package com.laptrinhjavaweb.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.laptrinhjavaweb.output.BackgroundOutput;
import com.laptrinhjavaweb.service.IBackgroundService;

@CrossOrigin
@RestController
public class BackgroundAPI {
	@Autowired
	private IBackgroundService backgroundService;

	@GetMapping(value = "background/{idName}")
	public BackgroundOutput showLink(@PathVariable("idName") String idName) {
		BackgroundOutput result = new BackgroundOutput();
		result.setBackground(backgroundService.findByIdName(idName));
		if (idName == "akagoe") {
			result.setNameOfGame("赤声\r\nChildren's Voices");
			result.setUrlDownLoad("./assets/file/setup.exe\r\n");
		}
		if (idName == "vot") {
			result.setNameOfGame("vot");
			result.setUrlDownLoad("./assets/file/setup.exe\r\n");
		}
		if (idName == "soulhalo") {
			result.setNameOfGame("soulhalo");
			result.setUrlDownLoad("./assets/file/setup.exe\r\n");
		}
		if (idName == "revivedknight") {
			result.setNameOfGame("revivedknight");
			result.setUrlDownLoad("./assets/file/setup.exe\r\n");
		}
		return result;
	}
}
