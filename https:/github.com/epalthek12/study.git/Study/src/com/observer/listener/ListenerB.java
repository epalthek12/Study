package com.observer.listener;

import com.observer.info.Information;

public class ListenerB {
	
	private Information info;
	private String name;
	private String sex; 
	
	public ListenerB(Information info){
		this.info = info;
	}
	
	public void update(){
		this.name = info.getName();
		this.sex = info.getSex();
	}
	
	public String outPrint(){
		return String.format("ListenerB name : %s, sex : %s", name, sex);
	}
}
