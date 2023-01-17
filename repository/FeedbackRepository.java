package com.laptrinhjavaweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptrinhjavaweb.entity.FeedbackEntity;

public interface FeedbackRepository extends JpaRepository<FeedbackEntity, Long> {
	
}
