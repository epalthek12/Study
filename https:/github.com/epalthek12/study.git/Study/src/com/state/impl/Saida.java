package com.state.impl;

import com.state.IF.Drink;

public class Saida implements Drink{

	@Override
	public int price() {
		return 1000;
	}

	@Override
	public String name() {
		return "사이다";
	}
}
