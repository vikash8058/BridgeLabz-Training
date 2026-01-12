package com.texteditor;

public class Action {
	
		
	String type;  //insert or delete
	String value; //text involved in action
	
	//constructor to initialize action 
	public Action(String type, String value) {
		this.type = type;
		this.value = value;
	}
	
	
}
