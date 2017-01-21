package com.state.machine;

import com.state.IF.Drink;
import com.state.IF.State;
import com.state.impl.PressedBtn;

public class Machine {
	
	private State state;
	
	public Machine(String str, Drink drink){
		state = new PressedBtn(str, drink);
	}
	
	public void setState(State state){
		this.state = state;
	}
	
	public void doAction(){
		this.state.doAction(this);
	}
	
	public State getState(){
		return this.state;
	}
}
