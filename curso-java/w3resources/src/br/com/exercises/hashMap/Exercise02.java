package br.com.exercises.hashMap;

import java.util.HashMap;

public class Exercise02 {

	/**
	 * Write a Java program to remove all the mappings from a map.
	 */
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "Red");
		hashMap.put(2, "Green");
		hashMap.put(3, "Black");
		hashMap.put(4, "White");
		hashMap.put(5, "Blue");

		System.out.println("The original linked map: " + hashMap);
		hashMap.clear();
		System.out.println("The new map: " + hashMap);
	}
}