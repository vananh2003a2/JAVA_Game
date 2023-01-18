package com.laptrinhjavaweb.service;

import java.util.List;

import com.laptrinhjavaweb.output.ContentOutput;

public interface IContentService {
	List<ContentOutput> findAll();
}
