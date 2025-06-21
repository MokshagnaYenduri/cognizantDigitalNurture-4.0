package com.inventoryManagement;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean running = true;
		InventoryManager im = new InventoryManager();
		while(running) {
			System.out.println("\n--- Inventory Management System ---");
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Delete Product");
            System.out.println("4. View Product");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            String choice = sc.nextLine();
            
            switch(choice) {
            case "1":
            	System.out.println("Enter product Id: ");
            	String id = sc.nextLine();
            	System.out.println("Enter product name: ");
            	String name = sc.nextLine();
            	System.out.println("Enter product quantity: ");
            	int quantity = Integer.parseInt(sc.nextLine());
            	System.out.println("Enter price of the product: ");
            	double price = Double.parseDouble(sc.nextLine());
            	
            	im.addProduct(new Product(id, name, quantity, price));
            	break;
            	
            case "2":
            	System.out.print("Enter Product ID to update: ");
                String updateId = sc.nextLine();
                System.out.print("Enter New Quantity: ");
                int newQty = Integer.parseInt(sc.nextLine());
                System.out.print("Enter New Price: ");
                double newPrice = Double.parseDouble(sc.nextLine());
                im.updateProduct(updateId, newPrice, newQty);
                break;
                
            case "3":
            	System.out.println("Enter the product ID to delete: ");
            	String prodId = sc.nextLine();
            	im.deleteProduct(prodId);
            	break;
            case "4":
            	System.out.println("Enter product ID to view: ");
            	String id1 = sc.nextLine();
            	System.out.println(im.getProduct(id1));
            	break;
            case"5":
            	System.out.println("Exiting...");
            	running = false;
            	break;
            default:
            	System.out.println("Invalid choice. Try again.");
            }
		}
	}
}
