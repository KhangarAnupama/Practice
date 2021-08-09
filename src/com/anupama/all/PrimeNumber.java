package com.anupama.all;

public class PrimeNumber {
	
	public static void checkPrime(int number) {
		boolean flag = true;
		for(int i = 2; i<= number/2; i++) {
			if(number%i == 0) {
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println(number +": is a prime number");
		}else {
			System.out.println(number +": is not prime number");
		}
	}
	
	
	public static void main(String[] args) {
		checkPrime(29);
		checkPrime(15);
		checkPrime(5);
	}

}
