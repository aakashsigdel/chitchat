package com.chitchat.controller;

import java.util.ArrayList;
import java.util.HashMap;

import com.chitchat.model.ModelMain;
import com.chitchat.view.ViewMain;

public class ControllerMain {
	private ModelMain model;
	private ViewMain view;
	private HashMap<String, String> userMap;
	
	
	public HashMap<String, String> getUserList() {
		userMap = new HashMap<String, String>();
		return userMap;
	}
	
	public void setUserListOnView() {
		
	}
	
	public void setMessageOnView() {
		view.setMessage(model.getMessage(), model.getUser(), model.getTimeStamp());
	}
	
	public void fillUsers(ArrayList<String> users) {
		for(String user : users) {
			//populate user in the chat window
		}
	}
	

	
}
