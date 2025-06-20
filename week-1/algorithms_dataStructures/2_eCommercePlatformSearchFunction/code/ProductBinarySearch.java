package com.searchFunction;

import java.util.ArrayList;

public class ProductBinarySearch implements search{

	@Override
	public Product search(ArrayList<Product> list, String name) {
		// TODO Auto-generated method stub

		list.sort((a,b)-> a.getProductName().compareToIgnoreCase(b.getProductName()));
		int left =0;
		int right = list.size()-1;
		
		while(left<=right) {
			int mid = left+(right-left) /2;
			Product midProd = list.get(mid);
			int compare = midProd.getProductName().compareToIgnoreCase(name);
			
			if(compare==0) {
				return midProd;
			}
			
			else if(compare<0)
				left = mid+1;
			else
				right = mid-1;
			
		}
		return null;
		
	}

}
