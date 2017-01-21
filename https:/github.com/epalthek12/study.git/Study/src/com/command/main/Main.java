package com.command.main;

import com.command.calc.Calc;
import com.command.calcIF.CalcIF;
import com.command.impl.CalcMultipliedBy;
import com.command.impl.CalcPlus;

public class Main {
	
	public static void main(String[] args) {
		
		// db.driver = oralce.dsdf.driver
		
		
		Calc calc = new Calc(
				new CalcPlus(),
				new CalcPlus(),
				new CalcIF() {
					@Override
					public double calculation(double num1, double num2) {
						return num1 / num2;
					}
					
					@Override
					public float calculation(float num1, float num2) {
						// TODO Auto-generated method stub
						return 0;
					}
					
					@Override
					public int calculation(int num1, int num2) {
						// TODO Auto-generated method stub
						return 0;
					}
				}
				,
				new CalcMultipliedBy()
				);
		
		
		int resultPlusInt = calc.calculation("+", 15, 20);
		float resultPlusFloat = calc.calculation("+", 20f, 50f);
		double resultPlusDouble = calc.calculation("+", 30d, 60d);
		
		int resultMinusInt = calc.calculation("-", 10, 50);
		float resultMinusFloat = calc.calculation("-", 10f, 50f);
		double resultMinusDouble = calc.calculation("-", 10d, 50d);
		
		int resultDividedByInt = calc.calculation("/", 10, 50);
		float resultDividedByFloat = calc.calculation("/", 10f, 50f);
		double resultDividedByDouble = calc.calculation("/", 10d, 50d);
		
		int resultMultipliedByInt = calc.calculation("*", 10, 50);
		float resultMultipliedByFloat = calc.calculation("*", 10f, 50f);
		double resultMultipliedByDouble = calc.calculation("*", 10d, 50d);
		
		System.out.printf("15 + 20 = %d", resultPlusInt);
		System.out.println();
		System.out.printf("20f + 50f = %f", resultPlusFloat);
		System.out.println();
		System.out.printf("30d + 60d = %f", resultPlusDouble);
		
		System.out.println();
		System.out.println();
		
		System.out.printf("10 - 50 = %d", resultMinusInt);
		System.out.println();
		System.out.printf("10f - 50f = %f", resultMinusFloat);
		System.out.println();
		System.out.printf("10d - 50d = %f", resultMinusDouble);
		
		System.out.println();
		System.out.println();
		
		System.out.printf("10 / 50 = %d", resultDividedByInt);
		System.out.println();
		System.out.printf("10f / 50f = %f", resultDividedByFloat);
		System.out.println();
		System.out.printf("10d / 50d = %f", resultDividedByDouble);
		
		System.out.println();
		System.out.println();
		
		System.out.printf("10 * 50 = %d", resultMultipliedByInt);
		System.out.println();
		System.out.printf("10f * 50f = %f", resultMultipliedByFloat);
		System.out.println();
		System.out.printf("10d * 50d = %f", resultMultipliedByDouble);
	}
}
