package com.command.calc;

import java.util.HashMap;
import java.util.Map;

import com.command.calcIF.CalcIF;

public class Calc {
	
	private Map<String, CalcIF> map;
	
	public Calc( CalcIF plus, CalcIF minus, CalcIF divide, CalcIF multy ){
		map = new HashMap<String, CalcIF>();
		map.put("+", plus);
		map.put("-", minus);
		map.put("/", divide);
		map.put("*", multy);
		
	}
//	public Calc() {
//		map = new HashMap<String, CalcIF>();
//		map.put("+", new CalcPlus());
//		map.put("-", new CalcMinus());
//		map.put("/", new CalcDividedBy());
//		map.put("*", new CalcMultipliedBy());
//	}

	public int calculation(String operand, int num1, int num2) {
		return map.get(operand).calculation(num1, num2);
	}
	public float calculation(String operand, float num1, float num2) {
		return map.get(operand).calculation(num1, num2);
	}
	public double calculation(String operand, double num1, double num2) {
		return map.get(operand).calculation(num1, num2);
	}
}
