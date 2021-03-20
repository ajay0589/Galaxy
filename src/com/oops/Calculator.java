package com.oops;

public class Calculator implements CalculatorI {

	public void add() {
		
	}
	
	public void add(int a, int b) {
		int c = a + b;

		System.out.println(c);
	}

	public void add(int a, int b, int d) {
		int c = a + b + d;

		System.out.println(c);
	}

	public static void main(String[] args) {
		CalculatorI obj = new Calculator();

		obj.add(34, 76);

		obj.add(28, 93);

		obj.add(18, 05);

		obj.add(4, 6, 5);
	}

}
