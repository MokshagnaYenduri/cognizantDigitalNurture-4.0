package com.forecast;

import java.util.Scanner;

public class forecasting {

	public static double futureValue(double pv, double r, double n) {
		if(n==0)
			return pv;
		
		return (1+r) *futureValue(pv,r,n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the present value: ");
		double presentValue = sc.nextDouble();
		
		System.out.println("Enter growth value: ");
		double growthRate = sc.nextDouble();
		
		System.out.println("Enter number of years: ");
		int n = sc.nextInt();
		
		System.out.println("The future value of "+presentValue+" after "+n+" years is: "+futureValue(presentValue, growthRate, n));
	}

}
