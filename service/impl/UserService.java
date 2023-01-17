package com.laptrinhjavaweb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laptrinhjavaweb.api.DTO.UserInput;
import com.laptrinhjavaweb.converter.UserConverter;
import com.laptrinhjavaweb.entity.UserEntity;
import com.laptrinhjavaweb.repository.UserRepository;
import com.laptrinhjavaweb.service.IUserService;

@Service
//de nhung service vao api
public class UserService implements IUserService {
//nhung userRepository vao

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserConverter userConverter;

	@Override
	public UserInput save(UserInput userInput) {
		UserEntity userEntity = new UserEntity();
		userEntity.setFullName(userInput.getFullName());
		userEntity.setEmail(userInput.getEmail());
		userEntity.setPhone(userInput.getPhone());
		userEntity = userRepository.save(userEntity);
		return userConverter.toDTO(userEntity);
	}
}
