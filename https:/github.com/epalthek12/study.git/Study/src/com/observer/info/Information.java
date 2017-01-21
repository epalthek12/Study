package com.observer.info;

import com.observer.listener.ListenerA;
import com.observer.listener.ListenerB;
import com.observer.listener.ListenerC;
import com.observer.listener.ListenerD;

public class Information {
	
	private String name;
	private String age;
	private String sex;
	private String state;
	
	private ListenerA listenerA;
	private ListenerB listenerB;
	private ListenerC listenerC;
	private ListenerD listenerD;

	public Information(){}
	
	public void addListener(ListenerA listenerA, ListenerB listenerB, ListenerC listenerC, ListenerD listenerD){
		this.listenerA = listenerA;
		this.listenerB = listenerB;
		this.listenerC = listenerC;
		this.listenerD = listenerD;
	}
	
	public void inputData(String name, String age, String sex, String state){
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.state = state;
		listenerA.update();
		listenerB.update();
		listenerC.update();
		listenerD.update();
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getAge(){
		return this.age;
	}
	
	public String getSex(){
		return this.sex;
	}
	
	public String getState(){
		return this.state;
	}
	
	public String outPrint(){
		
		StringBuilder builder = new StringBuilder();
		builder.append(listenerA.outPrint() + "\n");
		builder.append(listenerB.outPrint() + "\n");
		builder.append(listenerC.outPrint() + "\n");
		builder.append(listenerD.outPrint());
		
		return builder.toString();
	}
}
