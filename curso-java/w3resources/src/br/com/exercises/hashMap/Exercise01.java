package br.com.exercises.hashMap;

import java.util.HashMap;

public class Exercise01 {
	/**
	 * Write a Java program to associate the specified value with the specified key
	 * in a HashMap.
	 */
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "Red");
		hashMap.put(2, "Green");
		hashMap.put(3, "Black");
		hashMap.put(4, "White");
		hashMap.put(5, "Blue");

		hashMap.forEach((key, value) -> {
			System.out.println("Key: " + key + " Value : " + value);
		});
	}
}