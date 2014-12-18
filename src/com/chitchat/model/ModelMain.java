package com.chitchat.model;

import java.util.Date;

public class ModelMain {
	private String message;
	private String user;
	private Date timeStamp;
	
	public ModelMain() {
		this.message = "";
		this.user = "";
		this.timeStamp = new Date();
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public Date getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	
}
