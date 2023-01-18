package com.laptrinhjavaweb.service;

import java.util.List;

import com.laptrinhjavaweb.api.DTO.FeedbackDTO;
import com.laptrinhjavaweb.api.DTO.FeedbackInput;
import com.laptrinhjavaweb.output.FeedbackOutput;

public interface IFeedbackService {
	FeedbackDTO save(FeedbackInput feedbackinput);
	List<FeedbackOutput> findAllOrderByTimeAsc();
	List<FeedbackOutput> findAllOrderByStarAsc();
	List<FeedbackOutput> findAllOrderByTimeDesc();
	List<FeedbackOutput> findAllOrderByStarDesc();
}
