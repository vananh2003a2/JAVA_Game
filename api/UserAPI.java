package com.laptrinhjavaweb.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.laptrinhjavaweb.api.DTO.UserInput;
import com.laptrinhjavaweb.service.IUserService;

@RestController
public class UserAPI {
	@Autowired
	private IUserService userService;

	@PostMapping(value = "/user")
	public UserInput createUser(@RequestBody UserInput model) {
		return userService.save(model);
	}
}
