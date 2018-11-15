package com.capgemini;

import java.util.Scanner;

public class SubjectMarks {

	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in);
		System.out.println("1st Subject is ");
		int Subject1=scan.nextInt();
		System.out.println("2nd Subject is ");
		int Subject2=scan.nextInt();
		System.out.println("3rd Subject is ");
		int Subject3=scan.nextInt(); 
		
		if(Subject1>=60 && Subject2>=60 && Subject3>=60)
		{
			System.out.println("The Candidate passed in All Subject");
		}
		 else if (Subject1>=60 && Subject2>=60 && Subject3<=60 )
		{
			 System.out.println("The Candidate is promoted");
		}
		 else if (Subject1>=60 && Subject2<=60 && Subject3<=60 )
		 {
			 System.out.println("The Candidate is failed");
		 }
		 else
		 {
			 System.out.println("The Candidate does not exist");
		 }
		
	}

}
