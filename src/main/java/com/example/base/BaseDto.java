package com.example.base;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

public class BaseDto {

	@Getter
	private List<String> messageList = new ArrayList<>();
	
	public boolean hasErrors() {
		if(messageList.size() == 0) {
			return false;
		}
		
		for (String message : messageList) {
			if (message.startsWith("E"))
				return true;
		}
		
		return false;
	}
	
	public void addMessage(String message) {
		messageList.add(message);
	}
}
