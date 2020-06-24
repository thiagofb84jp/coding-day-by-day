package br.com.exercises.hashMap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Exercise05 {
	
	/**
	 * Write a Java program to create a set view of the mappings contained in a map.
	 */
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "Red");
		hashMap.put(2, "Green");
		hashMap.put(3, "Black");
		hashMap.put(4, "White");
		hashMap.put(5, "Blue");
		
		Set<Entry<Integer, String>> set = hashMap.entrySet();
		
		System.out.println("Set values: " + set);
	}
}