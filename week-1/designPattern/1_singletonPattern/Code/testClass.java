package com.singleton;

public class testClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger obj1 = Logger.getInstance();
		Logger obj2 = Logger.getInstance();
		
		if(obj1 == obj2) 
			System.out.println("Singleton works!!");
		else
			System.out.println("Singleton failed.");
	}

}
