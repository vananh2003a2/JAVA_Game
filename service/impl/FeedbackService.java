package com.laptrinhjavaweb.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laptrinhjavaweb.api.DTO.FeedbackDTO;
import com.laptrinhjavaweb.api.DTO.FeedbackInput;
import com.laptrinhjavaweb.converter.FeedbackConverter;
import com.laptrinhjavaweb.entity.FeedbackEntity;
import com.laptrinhjavaweb.output.FeedbackOutput;
import com.laptrinhjavaweb.repository.FeedbackRepository;
import com.laptrinhjavaweb.service.IFeedbackService;

@Service
public class FeedbackService implements IFeedbackService {
	@Autowired
	private FeedbackRepository feedbackRepository;

	//@Autowired
	//private UserRepository userRepository;

	@Autowired
	private FeedbackConverter feedbackConverter;

	@Override
	public FeedbackDTO save(FeedbackInput feedbackinput) {
		FeedbackEntity feedbackEntity = feedbackConverter.toEntity(feedbackinput);
		feedbackEntity = feedbackRepository.save(feedbackEntity);
		return feedbackConverter.toDTO(feedbackEntity);
	}

	@Override
	public List<FeedbackOutput> findAllOrderByTimeAsc() {
		List<FeedbackOutput> result = new ArrayList<>();
		List<FeedbackEntity> entities = feedbackRepository.findAllOrderByTimeAsc();
		for (FeedbackEntity item: entities) {
			FeedbackOutput feedbackOutput = feedbackConverter.converterShow(item);
			result.add(feedbackOutput);
		}
		return result;
	}

	@Override
	public List<FeedbackOutput> findAllOrderByStarAsc() {
		List<FeedbackOutput> result = new ArrayList<>();
		List<FeedbackEntity> entities = feedbackRepository.findAllOrderByStarAsc();
		for (FeedbackEntity item: entities) {
			FeedbackOutput feedbackOutput = feedbackConverter.converterShow(item);
			result.add(feedbackOutput);
		}
		return result;
	}

	@Override
	public List<FeedbackOutput> findAllOrderByTimeDesc() {
		List<FeedbackOutput> result = new ArrayList<>();
		List<FeedbackEntity> entities = feedbackRepository.findAllOrderByTimeDesc();
		for (FeedbackEntity item: entities) {
			FeedbackOutput feedbackOutput = feedbackConverter.converterShow(item);
			result.add(feedbackOutput);
		}
		return result;
	}

	@Override
	public List<FeedbackOutput> findAllOrderByStarDesc() {
		List<FeedbackOutput> result = new ArrayList<>();
		List<FeedbackEntity> entities = feedbackRepository.findAllOrderByStarDesc();
		for (FeedbackEntity item: entities) {
			FeedbackOutput feedbackOutput = feedbackConverter.converterShow(item);
			result.add(feedbackOutput);
		}
		return result;
	}

}
