package com.laptrinhjavaweb.output;

import java.util.ArrayList;
import java.util.List;

import com.laptrinhjavaweb.api.DTO.BackgroundDTO;

public class BackgroundOutput {
	private List<BackgroundDTO> background = new ArrayList<>();

	public List<BackgroundDTO> getBackground() {
		return background;
	}

	public void setBackground(List<BackgroundDTO> background) {
		this.background = background;
	}

	
}
