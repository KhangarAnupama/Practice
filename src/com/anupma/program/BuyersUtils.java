package com.anupma.program;

import java.util.ArrayList;
import java.util.List;

public class BuyersUtils {
	
	
	public static List<Buyer> getData(){
		List<Buyer> buyersList = new ArrayList<>();
		
		Buyer buyers = new Buyer("Rajan Patil", "Phone Cover", 170);
		buyersList.add(buyers);
		
		Buyer buyers1 = new Buyer("Mohit Gupta", "Samsung Battery", 900);
		buyersList.add(buyers1);
		
		Buyer buyers2 = new Buyer("Rajan Patil", "Samsung Battery", 1000);
		buyersList.add(buyers2);
		
		Buyer buyers3 = new Buyer("Nina Kothari", "Earphones", 500);
		buyersList.add(buyers3);
		
		Buyer buyers4 = new Buyer("T Sunitha", "Earphones", 550);
		buyersList.add(buyers4);
		
		Buyer buyers10 = new Buyer("Rohan Gade", "Motorola Battery", 10000);
		buyersList.add(buyers10);
		
		Buyer buyers5 = new Buyer("Rajan Patil", "Phone Cover", 550);
		buyersList.add(buyers5);
		
		Buyer buyers6 = new Buyer("Rajan Patil", "USB Cable", 150);
		buyersList.add(buyers6);
		
		Buyer buyers7 = new Buyer("Meena Kothari", "USB Cable", 100);
		buyersList.add(buyers7);
		
		Buyer buyers8 = new Buyer("Nina Kothari", "USB Cable", 200);
		buyersList.add(buyers8);
		
		Buyer buyers9 = new Buyer("Mohit Gupta", "USB Cable", 150);
		buyersList.add(buyers9);
		return buyersList	;
	}

}
