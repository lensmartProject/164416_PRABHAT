package com.capgemini;

import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter marks");
		int A=scan.nextInt();
		int B=scan.nextInt();
		int C=scan.nextInt();
		System.out.println("1st Student marks is In Subject A "+A);
		System.out.println("1st Student marks is In Subject B "+B);
		System.out.println("1st Student marks is In Subject C "+C);
		int Avg=(A+B+C)/3;
		System.out.println("1st Student Avg Marks is in all Subject "+Avg);
		
		System.out.println("Enter marks");
		int M=scan.nextInt();
		int N=scan.nextInt();
		int O=scan.nextInt();
		System.out.println("2nd Student marks is In Subject A "+M);
		System.out.println("2nd Student marks is In Subject B "+N);
		System.out.println("2nd Student marks is In Subject C "+O);
		int Avg2=(M+N+O)/3;
		System.out.println("2nd Student Avg Marks is in all Subject "+Avg2);
		
		
		System.out.println("Enter marks");
		int P=scan.nextInt();
		int Q=scan.nextInt();
		int R=scan.nextInt();
		System.out.println("3rd Student marks is In Subject A "+P);
		System.out.println("3rd Student marks is In Subject B "+Q);
		System.out.println("3rd Student marks is In Subject C "+R);
		int Avg3=(P+Q+R)/3;
		System.out.println("3rd Student Avg Marks is in all Subject "+Avg3);
		

	}

}
