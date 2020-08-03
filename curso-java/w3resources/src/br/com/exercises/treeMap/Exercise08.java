package br.com.exercises.treeMap;

import java.util.TreeMap;

public class Exercise08 {
	/**
	 * Write a Java program to search a value in a Tree Map.
	 */
	public static void main(String[] args) {
		TreeMap<String, String> treeMap = new TreeMap<>(new SortKey());
		treeMap.put("C1", "White");
		treeMap.put("C2", "Red");
		treeMap.put("C3", "Black");
		treeMap.put("C4", "Green");
		treeMap.put("C5", "Yellow");
		treeMap.put("C6", "Purple");

		if (treeMap.containsValue("Green")) {
			System.out.println("The TreeMap contains value Green");
		} else {
			System.out.println("The TreeMap does not contain value Green");
		}

		if (treeMap.containsValue("Pink")) {
			System.out.println("The TreeMap contains value Pink");
		} else {
			System.out.println("The TreeMap does not contain value Pink");
		}
	}
}