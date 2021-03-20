package com.adp;

public class Calculator {

	// data types

	int i = 10; // declare, define
	int j = 20;

	void add() {

		int c = i + j;

		System.out.println(c);

	}
	
	public static void main(String[] args) {
		
		Calculator obj = new Calculator();
		
		obj.add();
				
	}
	

}
