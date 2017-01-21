package com.state.impl;

import com.state.IF.Drink;
import com.state.IF.State;
import com.state.machine.Machine;

public class Calc implements State{
	
	private String str;
	private Drink drink;
	
	public Calc(String str, Drink drink) {
		this.str = str;
		this.drink = drink;
	}

	@Override
	public void doAction(Machine machine) {
		
		int temp = Integer.parseInt(str);
		int result = temp - drink.price();
		
		System.out.println(result + "원 남음");
		machine.setState(new PressedBtn(str, drink));
	}
}
