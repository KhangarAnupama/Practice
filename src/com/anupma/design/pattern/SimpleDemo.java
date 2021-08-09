package com.anupma.design.pattern;

public final class SimpleDemo {
	
	private final int age;
	
	private final int roolNumber;
	
	public SimpleDemo(int age, int roolNumber) {
		this.age = age;
		this.roolNumber = roolNumber;
	}
	
	public int getAge() {
		return age;
	}

	public int getRoolNumber() {
		return roolNumber;
	}
	
	
	public static void main(String[] args) {
		SimpleDemo demo = new SimpleDemo(12, 1234);
		System.out.println(demo.getAge());
	}
	
	
	
	

}
