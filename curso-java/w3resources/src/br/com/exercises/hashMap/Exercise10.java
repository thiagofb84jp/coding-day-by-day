package br.com.exercises.hashMap;

import java.util.HashMap;

public class Exercise10 {
	
	/**
	 * Write a Java program to test if a map contains a mapping for the specified value.
	 */
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "Red");
		hashMap.put(2, "Green");
		hashMap.put(3, "Black");
		hashMap.put(4, "White");
		hashMap.put(5, "Blue");

		System.out.println("The original map: " + hashMap);
		
		System.out.println("1. Is value \'Green\' exists?");
		
		if (hashMap.containsValue("Green")) {
			System.out.println("Yes!");
		} else {
			System.out.println("No!");
		}
		
		System.out.println("2. Is value \'Orange\' exists?");
		
		if (hashMap.containsValue("Orange")) {
			System.out.println("Yes!");
		} else {
			System.out.println("No!");
		}
	}

}
