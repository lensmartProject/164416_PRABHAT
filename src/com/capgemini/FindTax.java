package com.capgemini;

import java.util.Scanner;

public class FindTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("Enetr your CTC");
		int CTC =scan.nextInt();
		if(CTC <= 180000)
		{
			System.out.println("tax is nil");
			
		}
		else if(CTC >= 1800001 && CTC <= 300000)
		{
			int tax= CTC/10*100;
			System.out.println(tax);
		}
		else if(CTC >= 300001 && CTC <=500000)
		{
			int tax=CTC/10*100;
			System.out.println(tax);
		}
	}

}
