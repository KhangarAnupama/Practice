package com.anupma.program;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

public class TestBuyer {

	
	@OverridingDemo
	public void test() {
		
		BuyerTest buyer = new BuyerTest();
		Map<String, String> minPrice = buyer.findMinValueProductOwner();
		
		for(Map.Entry<String, Buyer> checkValue : minPrice.entrySet()) {
			String produceName = checkValue.getValue();
			String buyerName = checkValue.getKey();
			if(produceName == "Phone Cover") {
				assertTrue("Rajan Patil", buyerName);
			}else if(produceName == "Samsung Battery") {
				assertTrue("Mohit Gupta", buyerName);
			}else if(produceName == "Motorola Battery") {
				assertTrue("Rohan Gade", buyerName);
			}else if(produceName == "Earphones") {
				assertTrue("Nina Kothari", buyerName);
			}else if(produceName == "USB Cable") {
				assertTrue("Meena Kothari", buyerName);
			}
		}
	}
	
}
