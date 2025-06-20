package com.searchFunction;

import java.util.ArrayList;

public class ProductLinearSearch implements search{

	@Override
	public Product search(ArrayList<Product> list, String name) {
		// TODO Auto-generated method stub
		for(Product pd : list) {
			if(pd.getProductName().equalsIgnoreCase(name)) {
				return pd;
			}
		}
		return null;
	}
	
}
