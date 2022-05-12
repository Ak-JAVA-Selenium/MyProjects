package Demo_Practice;

import java.util.*;

public class a { // Write a program to count a occurrence of each character in a string using Hashmap ?
	
	public static void main(String[] args) {
		
		String s = "tata tcs is top company in india ";
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		char[] arr = s.toCharArray();
		
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			
			for (int j = 0; j < arr.length; j++) {
				
				if (arr[i] == arr[j]) {
					count++;
					hm.put(arr[i], count);
				}
			}
		}
		System.out.println(hm);
	}
}