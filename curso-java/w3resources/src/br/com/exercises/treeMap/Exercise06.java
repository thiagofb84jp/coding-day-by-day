package br.com.exercises.treeMap;

import java.util.TreeMap;

public class Exercise06 {

	/**
	 * Write a Java program to delete all elements from a given Tree Map.
	 */
	public static void main(String[] args) {
		TreeMap<String, String> treeMap = new TreeMap<>(new SortKey());
		treeMap.put("C1", "White");
		treeMap.put("C2", "Red");
		treeMap.put("C3", "Black");
		treeMap.put("C4", "Green");
		treeMap.put("C5", "Yellow");
		treeMap.put("C6", "Purple");

		System.out.println("Original Treemap content: " + treeMap);
		treeMap.clear();
		System.out.println("The new map: " + treeMap);
	}
}