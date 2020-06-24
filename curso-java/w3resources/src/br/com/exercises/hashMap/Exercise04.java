package br.com.exercises.hashMap;

import java.util.HashMap;

public class Exercise04 {

	/**
	 * Write a Java program to get a shallow copy of a HashMap instance.
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "Red");
		hashMap.put(2, "Green");
		hashMap.put(3, "Black");
		hashMap.put(4, "White");
		hashMap.put(5, "Blue");

		System.out.println("The original map: " + hashMap);

		HashMap<Integer, String> newHashMap = new HashMap<>();
		newHashMap = (HashMap<Integer, String>) hashMap.clone();
		System.out.println("Cloned map: " + newHashMap);
	}
}
