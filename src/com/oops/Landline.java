package com.oops;

public class Landline {

	void calling() {
		System.out.println("Calling from parent class landline with wiring");
	}

	public static void main(String[] args) {
		Landline obj = new Landline();
		//obj.calling();
		
		Mobile obj1 = new Mobile();  // object referance = actual object
		//obj1.calling();
		
		Landline obj2 = new Mobile();
		obj2.calling();
		

	}

}

class Mobile extends Landline {

	/*void calling() {
		System.out.println("Calling from parent class Mobile without wiring");
	}*/

}
