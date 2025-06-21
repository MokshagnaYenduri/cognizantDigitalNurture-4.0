package com.inventoryManagement;

import java.util.*;

public class inventoryManager {
	private Map<String, Product> list = new HashMap<>();
	
	public void addProduct(Product product) {
		list.put(product.getProductId(), product);
	}
	
	public void updateProduct(String id, double price, int quantity) {
		Product prod = list.get(id);
		
		if(prod!=null) {
			prod.setPrice(price);
			prod.setQuantity(quantity);
		}
		System.out.println("Product "+prod.getProductName()+" is updated!!");
	}
	
	public void deleteProduct(String id) {
		list.remove(id);
		System.out.println("Product with the ID "+id+" has been deleted successfully.");
	}
	
	public Product getProduct(String id) {
		return list.get(id);
	}
}
