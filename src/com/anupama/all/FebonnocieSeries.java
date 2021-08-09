package com.anupama.all;

public class FebonnocieSeries {
	
	
	// 0 1 1 2 3 5 8 13 21
	public static void main(String[] args) {
		int n = 0;
		int n1 = 1;
		int temp = 0;
		
		System.out.println(n);
		for(int i=0; i<=10; i++) {
			System.out.println(temp);
			temp = n + n1;
			n = n1;
			n1 = temp;
		}
	}
}
