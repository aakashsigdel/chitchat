package com.chitchat.controller;

import java.util.ArrayList;
import java.util.HashMap;

import com.chitchat.model.ModelChatMessages;
import com.chitchat.model.ModelUsers;
import com.chitchat.view.ViewMain;

public class ControllerMain {
	private ModelChatMessages modelChatMessages;
	private ModelUsers modelUsers;
	private ViewMain view;
	private HashMap<String, String> userMap;
	
	
	public HashMap<String, String> getUserList() {
		userMap = new HashMap<String, String>();
		return userMap;
	}
	
	public void setUserListOnView() {
		
	}
	
	public void setMessageOnView() {
		view.setMessage(modelChatMessages.getMessage(), modelChatMessages.getUser(), modelChatMessages.getTimeStamp());
	}
	
	public void fillUsers() {
		for(String user : userMap.keySet()) {
			//populate user in the chat window
		}
	}
	

	
}
