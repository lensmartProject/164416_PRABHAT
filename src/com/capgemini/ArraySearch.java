package com.capgemini;

import java.util.Scanner;

public class ArraySearch {

	public static void main(String[] args) {
		int a[] = new int[] { 5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52,
				86, 47 };
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter key value");
		int key = scanner.nextInt();
		boolean found = false;
		int i = 0;

		for (i = 0; i <= a.length; i++) {
			if (a[i] == key) {
				System.out.println("value found");
				found = true;
				break;
			}
		}
		if (found) {
			System.out.println("Found " + key + " at index " + i);
		}

		else {
			System.out.println(key + "is not in this array");
		}

	}

}
