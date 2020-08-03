package br.com.exercises.treeMap;

import java.util.TreeMap;

public class Exercise10 {
	/**
	 * Write a Java program to copy a Tree Map content to another Tree Map.
	 */
	public static void main(String[] args) {
		TreeMap<String, String> treeMap1 = new TreeMap<>();
		treeMap1.put("C1", "White");
		treeMap1.put("C2", "Red");
		treeMap1.put("C3", "Black");
		treeMap1.put("C4", "Green");
		treeMap1.put("C5", "Yellow");
		treeMap1.put("C6", "Purple");
		System.out.println("TreeMap 1: " + treeMap1);

		TreeMap<String, String> treeMap2 = new TreeMap<>();
		treeMap2.put("A1", "Orange");
		treeMap2.put("A2", "Pink");
		System.out.println("TreeMap 2: " + treeMap2);

		treeMap1.putAll(treeMap2);

		System.out.println("After coping TreeMap2 to TreeMap1: " + treeMap1);
	}
}