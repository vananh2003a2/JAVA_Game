package com.laptrinhjavaweb.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laptrinhjavaweb.output.ExploreOutput;
import com.laptrinhjavaweb.service.IExploreService;

@RestController
public class ExploreAPI {
@Autowired
private IExploreService exploreService;

	@GetMapping(value = "/explore")
	public ExploreOutput showExplore() {
		ExploreOutput result = new ExploreOutput();
		result.setListResult(exploreService.findAll());
		return result ;
	}
}
