package com.state.impl;

import com.state.IF.Drink;
import com.state.IF.State;
import com.state.machine.Machine;

public class PressedBtn implements State{

	private String str;
	private Drink drink;
	
	public PressedBtn(String str, Drink drink) {
		this.str = str;
		this.drink = drink;
	}
	
	@Override
	public void doAction(Machine machine) {
		System.out.println(drink.name() + " 선택");
		machine.setState(new InsertCoin(str, drink));
	}
}
