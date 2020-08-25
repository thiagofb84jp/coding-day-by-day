package br.com.exercises.treeSet;

import java.util.TreeSet;

public class Exercise13 {
	
	/*
	 * Write a Java program to add all the elements of a specified tree set to another tree set.
	 */
	public static void main(String[] args) {
		TreeSet<String> treeSet1 = new TreeSet<>();
		treeSet1.add("Red");
		treeSet1.add("Green");
		treeSet1.add("Orange");
		System.out.println("Tree Set (1)" + treeSet1);
		
		TreeSet<String> treeSet2 = new TreeSet<>();
		treeSet2.add("Pink");
		treeSet2.add("White");
		treeSet2.add("Black");
		System.out.println("Tree Set (2)" + treeSet2);
		
		treeSet1.addAll(treeSet2);
		
		System.out.println("Tree Set (1)" + treeSet1);
	}
}