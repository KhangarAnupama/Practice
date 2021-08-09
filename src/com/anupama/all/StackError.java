package com.anupama.all;

public class StackError {
	
	public static int sum(int a, int b) {
		int add = a+b;
		return sum(add, b);
	}
	
	public static void main(String[] args) {
		sum(2, 4);
	}

}
