package com.anupama.all;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MapValueAssign {
	
	
	
	public void m1() {
		HashMap<String, Integer> s = new HashMap<>();
		s.put("A", null);
		s.put("B", null);
		s.put("C", null);
		
		List<String> a = Arrays.asList("A","B","C");
		int i =1;
		for (String string : a) {
			m2(s, string, i);
			i = i+1;
		}
		
		s.values().stream().forEach(System.out::println);
	}
	
	private void m2(HashMap<String, Integer> s,String string, int i) {
		s.put(string, i);
	}
	
	public static void main(String[] args) { 
		MapValueAssign assign = new MapValueAssign();
		assign.m1();
		
	}

}
