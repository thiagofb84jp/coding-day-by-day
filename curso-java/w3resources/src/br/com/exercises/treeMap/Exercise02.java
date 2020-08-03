package br.com.exercises.treeMap;

import java.util.TreeMap;

public class Exercise02 {
	/**
	 * Write a Java program to get a reverse order view of the keys contained in a
	 * given map.
	 */
	public static void main(String[] args) {
		TreeMap<String, String> treeMap = new TreeMap<>();
		treeMap.put("C1", "Red");
		treeMap.put("C2", "Green");
		treeMap.put("C3", "Black");
		treeMap.put("C4", "White");
		treeMap.put("C5", "Blue");

		System.out.println("Original Treemap content: " + treeMap);
		System.out.println("Reverse order view of the keys: " + treeMap.descendingKeySet());
	}
}