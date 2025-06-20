package com.searchFunction;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		ArrayList<Product> list = new ArrayList<>();
		 list.add(new Product(101, "Laptop", "Electronics"));
	     list.add(new Product(102, "Shirt", "Clothing"));
	     list.add(new Product(103, "Coffee Maker", "Kitchen"));
	     list.add(new Product(104, "Headphones", "Electronics"));
	     list.add(new Product(105, "Book", "Books"));
	     
	     System.out.println("Enter a name to search (binary search): ");
	     Scanner sc = new Scanner(System.in);
	     String name = sc.nextLine();
	     
	     ProductBinarySearch bs = new ProductBinarySearch();
	     Product pd = bs.search(list, name);
	     if(pd!=null)
	    	 System.out.println("Product: "+pd.getProductId()+" "+pd.getProductName()+" "+pd.getProductCategory());
	     else
	    	 System.out.println("Product not found");
	     
	     System.out.println("Enter a name to search (linear search): ");
	     String linearName = sc.nextLine();
	     ProductLinearSearch ls = new ProductLinearSearch();
	     Product prod = ls.search(list, linearName);
	     if(prod!=null)
	    	 System.out.println("Product: "+prod.getProductId()+" "+prod.getProductName()+" "+prod.getProductCategory());
	     else
	    	 System.out.println("Product not found");
	     
	     sc.close();
	}
}
