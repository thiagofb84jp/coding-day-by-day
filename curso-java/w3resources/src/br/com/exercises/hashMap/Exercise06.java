package br.com.exercises.hashMap;

import java.util.HashMap;

public class Exercise06 {

	/**
	 * Write a Java program to get the value of a specified key in a map.
	 */
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "Red");
		hashMap.put(2, "Green");
		hashMap.put(3, "Black");
		hashMap.put(4, "White");
		hashMap.put(5, "Blue");

		String value = hashMap.get(0);
		System.out.println("Value for key 3 is: " + value);
	}
}