package com.capgemini;

import java.util.Scanner;

public class SimpleCompoundIntrest {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter The Year");
		int year= scan.nextInt();
		System.out.println("Enter The rate");
		float rate=scan.nextFloat();
		System.out.println("Principal Amount");
		int p=scan.nextInt();
		System.out.println("No of intrest per Year");
		int n=scan.nextInt();
		
		float SI=p*year*rate;
		System.out.println("Simple Intrest is "+ SI);
		
		float CI = ((1+rate)*n-1);
		
		System.out.println(CI);

	}

	

}
