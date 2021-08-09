package com.anupama.all;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		List l = new LinkedList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		
		// How to find size of linked List
		System.out.println(l.size());
		
		// Get particular node value
		System.out.println(l.get(1));
		
	}

}
