package br.com.exercises.treeMap;

import java.util.TreeMap;

public class Exercise09 {
	
	/**
	 * Write a Java program to search a key in a Tree Map.
	 */
	public static void main(String[] args) {
		TreeMap<String, String> treeMap = new TreeMap<>(new SortKey());
		treeMap.put("C1", "White");
		treeMap.put("C2", "Red");
		treeMap.put("C3", "Black");
		treeMap.put("C4", "Green");
		treeMap.put("C5", "Yellow");
		treeMap.put("C6", "Purple");

		if (treeMap.containsKey("C1")) {
			System.out.println("The TreeMap contains key C1");
		} else {
			System.out.println("The TreeMap does not contain key C1");
		}

		if (treeMap.containsValue("Pink")) {
			System.out.println("The TreeMap contains key C7");
		} else {
			System.out.println("The TreeMap does not contain key C7");
		}
	}
}