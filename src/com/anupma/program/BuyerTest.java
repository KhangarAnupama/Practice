package com.anupma.program;

import java.util.HashMap;
import java.util.Map;

public class BuyerTest {
	
	public static void main(String[] args) {
		Map<String, Buyer> minPrice = new HashMap<>();
		
		for (Buyer latest : BuyersUtils.getData()) {
			
			Buyer old = minPrice.get(latest.getProductName());
			if(old != null) {
				
				if(old.getPrice() > latest.getPrice()) {
					minPrice.put(latest.getProductName(), latest);
				}
				
			}else {
				minPrice.put(latest.getProductName(), latest);
			}
		} 
		
		for(Map.Entry<String, Buyer> entry : minPrice.entrySet()) {
			System.out.println(entry.getValue().getProductName() + "  "+entry.getValue().getName());
			
		}
		
	}

}
