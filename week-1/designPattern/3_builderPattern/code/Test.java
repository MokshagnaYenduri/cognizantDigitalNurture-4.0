package com.builder;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the ram of your new pc in GBs: ");
		int ram = sc.nextInt();
		System.out.println("Enter the os of your new pc: ");
		String os = sc.next();
		sc.nextLine();
		System.out.println("Enter the storage of your new pc in GBs: ");
		int storage = sc.nextInt();
		
		Computer pc = new ComputerBuilder().setCpu(os).setRam(ram).setStorage(storage).buildComputer();
		System.out.println(pc);
		
		sc.close();
	}
}
