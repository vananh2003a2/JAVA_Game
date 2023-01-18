package com.laptrinhjavaweb.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laptrinhjavaweb.output.AboutOutput;
import com.laptrinhjavaweb.service.IContentService;

@RestController
public class AboutAPI {
	@Autowired
	private IContentService contentService;

	@GetMapping(value = "/about")
	public AboutOutput showAbout() {
		AboutOutput result = new AboutOutput();
		result.setListContent(contentService.findAll());
		return result;
	}
}
