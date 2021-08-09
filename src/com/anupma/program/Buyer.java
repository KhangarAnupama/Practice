package com.anupma.program;

public class Buyer {
	
	private String name;
	private String location;
	private int date;
	private String productName;
	private int price;
	private String  paymentType;
	
	public Buyer(String name, String productName, int price) {
		this.name = name;
		this.productName = productName;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public int getDate() {
		return date;
	}

	public String getProductName() {
		return productName;
	}

	public int getPrice() {
		return price;
	}

	public String getPaymentType() {
		return paymentType;
	}
	
}
