package com.anupama.all;

public class FloatDoubleDemo {
	
	/**
	 * Float is 4 byte n double is 8 byte
	 * Float store upto 5-6 values after decimal point
	 * Double store upto 14-16 values after decimal point
	 * For float explicitly need to add f to literal, otherwise consider as double
	 * If we use float might be chances that while calculating data will loss
	 */
	
    /**
     * BigDecimal is similar to double,
     * big advantages of BigDecimal is it provide accuracy when perform math operation
     * for banking sector calculation, we can use BigDecimal, but is is slow
     * https://stackoverflow.com/questions/3413448/double-vs-bigdecimal 
     */
	public static void main(String[] args) {
		double d = 10.123456789123456789;
		float  f = 12.123456f;
		System.out.println(d);
		System.out.println(f);
	}
	

}
