package br.com.exercises.hashMap;

import java.util.HashMap;

public class Exercise09 {
	
	/**
	 * Write a Java program to copy all of the mappings from the specified map to another map.
	 */
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap1 =new HashMap<Integer, String>();
		hashMap1.put(1, "Red");
		hashMap1.put(2, "Green");
		hashMap1.put(3, "Black");
		System.out.println("\nValues in first map: " + hashMap1);
		
		
		HashMap<Integer, String> hashMap2 =new HashMap<Integer, String>();
		hashMap2.put(4, "White");
		hashMap2.put(5, "Blue");
		hashMap2.put(6, "Orange");
		System.out.println("\nValues in first map: " + hashMap2);
		
		hashMap2.putAll(hashMap1);
		System.out.println("\nNow values in second map: " + hashMap2);
	}
}