package br.com.exercises.hashMap;

import java.util.HashMap;

public class Exercise03 {

	/**
	 * Write a Java program to check whether a map contains key-value mappings (empty) or not.
	 */
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "Red");
		hashMap.put(2, "Green");
		hashMap.put(3, "Black");
		hashMap.put(4, "White");
		hashMap.put(5, "Blue");

		boolean result = hashMap.isEmpty();
		System.out.println("Is hash map empty? " + result); //false

		hashMap.clear();
		result = hashMap.isEmpty();
		System.out.println("Is hash map empty? " + result); //true
	}
}
