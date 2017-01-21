package com.state.impl;

import com.state.IF.Drink;
import com.state.IF.State;
import com.state.machine.Machine;

public class InsertCoin implements State{
	
	private String str;
	private Drink drink;

	public InsertCoin(String str, Drink drink) {
		this.str = str;
		this.drink = drink;
	}

	@Override
	public void doAction(Machine machine) {
		System.out.println(str + "원 받음");
		machine.setState(new Calc(str, drink));
	}
}
