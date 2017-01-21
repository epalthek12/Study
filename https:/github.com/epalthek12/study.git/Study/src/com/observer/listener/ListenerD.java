package com.observer.listener;

import com.observer.info.Information;

public class ListenerD {
	private Information info;
	private String name;
	private String age;
	private String sex;
	
	public ListenerD(Information info){
		this.info = info;
	}
	
	public void update(){
		this.name = info.getName();
		this.age = info.getAge();
		this.sex = info.getSex();
	}
	
	public String outPrint(){
		return String.format("ListenerD name : %s, age : %s, sex : %s", name, age, sex);
	}
}
