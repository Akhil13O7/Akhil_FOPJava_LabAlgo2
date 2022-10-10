package com.greatLearning;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of currency notes in your country");
		int size = sc.nextInt();

		int currency[] = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the currency denomination " + i);
			currency[i] = sc.nextInt();
		}
		System.out.println("Before sorting" + Arrays.toString(currency));
		ArraySort bs = new ArraySort();
		bs.sort(currency);
		System.out.println("After sorting" + Arrays.toString(currency));

		System.out.println("Please enter how much payment you need to make");
		int amount = sc.nextInt();

		CountNotes nc = new CountNotes();
		nc.counting(currency, amount);

	}

}
