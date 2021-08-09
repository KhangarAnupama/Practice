package com.anupama.all;

import java.util.Arrays;

public class Anagram {
	
	/**
	 * Anagram means the element is formed by rearranging the
	 * element of other words.
	 * To check both elements are anagram or not,
	 * need to check contents of all elements are same
	 */
	public static void usingThirdParty() {
		String ip = "apple";
		String op = "elppa";
		
		char[] n1 = ip.toCharArray();
		char[] n2 = op.toCharArray();
		
		Arrays.sort(n1);
		Arrays.sort(n2);
		
		if(n1.length == n2.length) {
			for(int i=0;i<n1.length;i++) {
				if(n1[i] == n2[i]) {
					
				}else {
					System.out.println("--- Noop ----");
					break;
				}
			}
		}else {
			System.out.println("--- Noop ----");
		}
	}
	
	public static void main(String[] args) {
	
		usingThirdParty();
	}

}
