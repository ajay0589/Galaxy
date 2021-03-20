package com.adp;

public class ChainingAction {

	// data types
	// primitive data types
	// class type data types

	// local vs global variables
	// static vs instance(non static) variables/methods

	int i, j;
	static ChainingAction obj;

	public static void main(String[] args) {
		obj = new ChainingAction();

		/*int k = obj.test1();
		
		int m = k-100;
		
		System.out.println(m);*/
				
		obj.test2().test3();
		

	}

	int test1() {
		System.out.println("In test1");

		int c = 10 + 20;

		return c;
	}
	
	
	ChainingAction test2() {
		System.out.println("In test2");
		
		return obj;
	}
	
	ChainingAction test3() {
		System.out.println("In test3");
		
		return obj;
	}

}





