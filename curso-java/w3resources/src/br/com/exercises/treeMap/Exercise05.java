package br.com.exercises.treeMap;

import java.util.Comparator;
import java.util.TreeMap;

public class Exercise05 {

	/**
	 * Write a Java program to sort keys in Tree Map by using comparator.
	 */
	public static void main(String[] args) {
		TreeMap<String, String> treeMap = new TreeMap<>(new SortKey());
		treeMap.put("C6", "Purple");
		treeMap.put("C2", "Red");
		treeMap.put("C4", "Green");
		treeMap.put("C3", "Black");
		treeMap.put("C1", "White");
		treeMap.put("C5", "Yellow");

		System.out.println(treeMap);
	}
}

class SortKey implements Comparator<String> {

	@Override
	public int compare(String str1, String str2) {
		return str1.compareTo(str2);
	}
}