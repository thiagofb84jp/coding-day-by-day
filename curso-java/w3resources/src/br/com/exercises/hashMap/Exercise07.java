package br.com.exercises.hashMap;

import java.util.HashMap;
import java.util.Set;

public class Exercise07 {

	/**
	 * Write a Java program to get a set view of the keys contained in this map.
	 */
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "Red");
		hashMap.put(2, "Green");
		hashMap.put(3, "Black");
		hashMap.put(4, "White");
		hashMap.put(5, "Blue");
		
		Set<Integer> keySet = hashMap.keySet();
		
		System.out.println("Key set value are: " + keySet);
	}
}
