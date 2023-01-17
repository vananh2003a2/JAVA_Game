package com.laptrinhjavaweb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laptrinhjavaweb.api.DTO.FeedbackInput;
import com.laptrinhjavaweb.converter.FeedbackConverter;
import com.laptrinhjavaweb.entity.FeedbackEntity;
import com.laptrinhjavaweb.entity.UserEntity;
import com.laptrinhjavaweb.repository.FeedbackRepository;
import com.laptrinhjavaweb.repository.UserRepository;
import com.laptrinhjavaweb.service.IFeedbackService;

@Service
public class FeebackService implements IFeedbackService {
	@Autowired
	private FeedbackRepository feedbackRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private FeedbackConverter feedbackConverter;

	@Override
	public FeedbackInput save(FeedbackInput feedbackinput) {
		UserEntity userEntity = userRepository.findOneByemail(feedbackinput.getEmailUser());
		FeedbackEntity feedbackEntity = feedbackConverter.toEntity(feedbackinput);
		feedbackEntity.setUser(userEntity);
		feedbackEntity = feedbackRepository.save(feedbackEntity);
		return feedbackConverter.toDTO(feedbackEntity);
	}

}
