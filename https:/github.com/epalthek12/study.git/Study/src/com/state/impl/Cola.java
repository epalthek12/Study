package com.state.impl;

import com.state.IF.Drink;

public class Cola implements Drink{

	@Override
	public int price() {
		return 100;
	}

	@Override
	public String name() {
		return "콜라";
	}
}
