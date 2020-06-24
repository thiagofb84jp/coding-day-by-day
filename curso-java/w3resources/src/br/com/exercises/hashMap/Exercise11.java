package br.com.exercises.hashMap;

import java.util.HashMap;

public class Exercise11 {

	/**
	 * Write a Java program to test if a map contains a mapping for the specified
	 * key.
	 */
	public static void main(String[] args) {
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		hashMap.put("Red", 1);
		hashMap.put("Green", 2);
		hashMap.put("Black", 3);
		hashMap.put("White", 4);
		hashMap.put("Blue", 5);

		System.out.println("The original map: " + hashMap);

		System.out.println("1. Is value \'Green\' exists?");

		if (hashMap.containsKey("Green")) {
			System.out.println("Yes!" + hashMap.get("Green"));
		} else {
			System.out.println("No!");
		}

		System.out.println("2. Is value \'Orange\' exists?");

		if (hashMap.containsKey("Orange")) {
			System.out.println("Yes!" + hashMap.get("Orange"));
		} else {
			System.out.println("No!");
		}
	}

}
