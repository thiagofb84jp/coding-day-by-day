package br.com.exercises.treeMap;

import java.util.TreeMap;

public class Exercise01 {
	/**
	 * Write a Java program to associate the specified value with the specified key in a Tree Map.
	 */

	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(1, "Red");
		treeMap.put(2, "Green");
		treeMap.put(3, "Black");
		treeMap.put(4, "White");
		treeMap.put(5, "Blue");

		treeMap.forEach((key, value) -> {
			System.out.println(key + " => " + value);
		});
	}
}