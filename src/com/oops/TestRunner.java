package com.oops;

public class TestRunner {

	public static void main(String[] args) {

		/*
		 * Calculator obj = new Calculator();
		 * 
		 * // obj.add(23, 45);
		 * 
		 * CalculatorI obj1 = new Calculator();
		 * 
		 * obj1.add(12, 23, 15);
		 */

		NumberGenerator ng = new NumberGenerator();

		System.out.println(ng.getValue());

		ng.setValue();

		System.out.println(ng.getValue());

		ng.setValue();

		System.out.println(ng.getValue());

		ng.setValue();

		System.out.println(ng.getValue());

		ng.setValue();

		System.out.println(ng.getValue());
	}

}
