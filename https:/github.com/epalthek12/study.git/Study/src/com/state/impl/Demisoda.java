package com.state.impl;

import com.state.IF.Drink;

public class Demisoda implements Drink{

	@Override
	public int price() {
		return 500;
	}

	@Override
	public String name() {
		return "데미소다";
	}
}
