package com.adp;

public class ReverseWord {

	public static void main(String[] args) {

		// data manipulation
		// Numbers, Characters, Strings, Special characters

		String s = "java"; // 4... 0-j 1-a 2-v 3-a
		
		String output = ""; // avaj

		int n = s.length();

		for (int i = n - 1; i >= 0; i--) {

			char c = s.charAt(i); // a    v     a     j

			output = output + c; // a     av     ava     avaj
		}
		
		System.out.println(output);

	}

}
