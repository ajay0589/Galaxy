package com.adp;

import java.util.Arrays;

public class Store {

	int c = 10;

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };

		int b[] = new int[5];

		b[0] = 11;
		b[1] = 12;
		b[2] = 13;
		b[3] = 14;
		b[4] = 15;

		// Arrays

		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));

		// 100 73 27 {1,2,5,10,20,50,100} min no. of notes

		int notes[] = { 100, 50, 20, 10, 5, 2, 1 }; // {20,100,10,1,5,2,50}

		int n = 100;
		int itemCost = 73; // return amount 27

		int noOfNotes = 0;

		int returnAmount = n - itemCost; // 27

		while (returnAmount > 0) {

			for (int i = 0; i < notes.length; i++) {
				int k = notes[i]; // 100 50 20

				if (returnAmount >= k) { // 27>20
					returnAmount = returnAmount - k; // 27-20 7
					noOfNotes++;
					System.out.println("Note is: " + k);
					break;
				}
			}
		}
		System.out.println("Total no. of notes: " + noOfNotes);
	}

}
