package com.laptrinhjavaweb.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.laptrinhjavaweb.api.DTO.FeedbackInput;
import com.laptrinhjavaweb.service.IFeedbackService;

@RestController
public class FeedbackAPI {
	@Autowired
	private IFeedbackService feedbackService;

	@PostMapping(value = "/feedback")
	public FeedbackInput createFeedback(@RequestBody FeedbackInput model) {
		return feedbackService.save(model);
	}
}
