package br.com.exercises.treeSet;

import java.util.TreeSet;

public class Exercise14 {

	/*
	 * Write a Java program to compare two tree sets.
	 */
	public static void main(String[] args) {
		TreeSet<String> treeSet1 = new TreeSet<>();
		treeSet1.add("Red");
		treeSet1.add("Green");
		treeSet1.add("Black");
		treeSet1.add("White");
		treeSet1.add("Blue");
		treeSet1.add("Cyan");
		System.out.println("First Tree Set (1)" + treeSet1);
		
		TreeSet<String> treeSet2 = new TreeSet<>();
		treeSet2.add("Red");
		treeSet2.add("Pink");
		treeSet2.add("Black");
		treeSet2.add("Orange");
		treeSet2.add("Blue");
		treeSet2.add("Purple");
		System.out.println("Second Tree Set (2)" + treeSet2);
		
		for(String element: treeSet1) {
			System.out.println(treeSet2.contains(element) ? "Yes!" : "No");
		}
		
	}
}