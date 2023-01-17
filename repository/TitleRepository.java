package com.laptrinhjavaweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptrinhjavaweb.entity.TitleEntity;

public interface TitleRepository extends JpaRepository<TitleEntity, Long> {

}
