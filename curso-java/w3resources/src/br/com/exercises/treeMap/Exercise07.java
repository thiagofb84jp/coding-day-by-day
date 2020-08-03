package br.com.exercises.treeMap;

import java.util.Set;
import java.util.TreeMap;

public class Exercise07 {
	/**
	 * Write a Java program to get all keys from the given a Tree Map.
	 */
	public static void main(String[] args) {
		TreeMap<String, String> treeMap = new TreeMap<>(new SortKey());
		treeMap.put("C1", "White");
		treeMap.put("C2", "Red");
		treeMap.put("C3", "Black");
		treeMap.put("C4", "Green");
		treeMap.put("C5", "Yellow");
		treeMap.put("C6", "Purple");
		
		Set<String> keys = treeMap.keySet();
		
		for(String key: keys) {
			System.out.println(key);
		}
	}
}