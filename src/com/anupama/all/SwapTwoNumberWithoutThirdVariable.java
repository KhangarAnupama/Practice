package com.anupama.all;

public class SwapTwoNumberWithoutThirdVariable {
	
	public static void main(String[] args) {
		int x =10;
		int y =20;
		
		y = x + y; // 30
		x = y - x; // 20
		y = y - x; // 10
		
		System.out.println(x);
		System.out.println(y);
		
	}
}

