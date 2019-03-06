package com.sync.demo.model;

import org.springframework.stereotype.Component;

@Component
public class InputRequest {
	
	String messageType;
	String message;
	InputRequest(){}
	public InputRequest(String messageType, String message) {
		super();
		this.messageType = messageType;
		this.message = message;
	}
	public String getmessageType() {
		return messageType;
	}

	public void setmessageType(String messageType) {
		this.messageType = messageType;
	}
	
	public String getmessage() {
		return message;
	}

	public void setmessage(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		return String.format(
				" [messageType=%s, message=%s]", messageType, message);
	}

}
