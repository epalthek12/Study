package com.observer.listener;

import com.observer.info.Information;

public class ListenerC {
	private Information info;
	private String name;
	private String state; 
	
	public ListenerC(Information info){
		this.info = info;
	}
	
	public void update(){
		this.name = info.getName();
		this.state = info.getState();
	}
	
	public String outPrint(){
		return String.format("ListenerC name : %s, state : %s", name, state);
	}
}
