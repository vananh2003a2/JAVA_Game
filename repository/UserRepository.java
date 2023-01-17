package com.laptrinhjavaweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptrinhjavaweb.entity.UserEntity;

//thao tac xuong bang user thong qua UserEntity
public interface UserRepository extends JpaRepository<UserEntity, Long> {
	UserEntity findOneByemail (String email);     
}
