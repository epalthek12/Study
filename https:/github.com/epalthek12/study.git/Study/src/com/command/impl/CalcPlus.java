package com.command.impl;

import com.command.calcIF.CalcIF;

public class CalcPlus implements CalcIF{

	@Override
	public int calculation(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public float calculation(float num1, float num2) {
		return num1 + num2;
	}

	@Override
	public double calculation(double num1, double num2) {
		return num1 + num2;
	}
}
