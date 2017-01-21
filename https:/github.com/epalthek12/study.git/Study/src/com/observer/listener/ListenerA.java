package com.observer.listener;

import com.observer.info.Information;

public class ListenerA {
	
	private Information info;
	private String name;
	private String age;
	
	public ListenerA(Information info){
		this.info = info;
	}
	
	public void update(){
		this.name = info.getName();
		this.age = info.getAge();
	}
	
	public String outPrint(){
		return String.format("ListenerA name : %s, age : %s", name, age);
	}
}
