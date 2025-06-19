package com.singleton;

public class Logger {
	private static Logger obj;
	private Logger(){
	}
	
	public static Logger getInstance() {
		if(obj == null) {
			System.out.println("Instance has been created!!!");
			return obj = new Logger();
		}
		else
		System.out.println("Instance has already been created.");
		
		return obj;
	}

}
