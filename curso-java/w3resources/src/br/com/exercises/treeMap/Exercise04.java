package br.com.exercises.treeMap;

import java.util.TreeMap;

public class Exercise04 {

	/**
	 * Write a Java program to get a key-value mapping associated with the greatest
	 * key and the least key in a map.
	 */
	public static void main(String[] args) {
		TreeMap<String, String> treeMap = new TreeMap<>();
		treeMap.put("C1", "Red");
		treeMap.put("C2", "Green");
		treeMap.put("C3", "Black");
		treeMap.put("C4", "White");
		treeMap.put("C5", "Yellow");

		System.out.println("Original Tremap content: " + treeMap);
		System.out.println("Greatest entry: " + treeMap.firstEntry());
		System.out.println("Least entry: " + treeMap.lastEntry());
		System.out.println("Greatest key: " + treeMap.firstKey());
		System.out.println("Least key: " + treeMap.lastKey());
	}
}