package br.com.exercises.treeMap;

import java.util.TreeMap;

public class Exercise03 {

	/**
	 * Write a Java program to get the first (lowest) key and the last (highest) key
	 * currently in a map.
	 */
	public static void main(String[] args) {
		TreeMap<String, String> treeMap = new TreeMap<>();
		treeMap.put("C2", "Red");
		treeMap.put("C1", "Green");
		treeMap.put("C4", "Black");
		treeMap.put("C3", "White");
		treeMap.put("C5", "Blue");

		System.out.println("Original Treemap content: " + treeMap);
		System.out.println("Greatest key: " + treeMap.firstKey());
		System.out.println("Least key: " + treeMap.lastKey());
	}
}