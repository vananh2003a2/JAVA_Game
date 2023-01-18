package com.laptrinhjavaweb.output;

import java.util.ArrayList;
import java.util.List;

import com.laptrinhjavaweb.output.ContentOutput;

public class AboutOutput {
	private List<ContentOutput> listContent = new ArrayList<>();

	public List<ContentOutput> getListContent() {
		return listContent;
	}
	public void setListContent(List<ContentOutput> listContent) {
		this.listContent = listContent;
	}
	
}
