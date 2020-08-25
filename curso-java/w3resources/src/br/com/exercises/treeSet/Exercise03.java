package br.com.exercises.treeSet;

import java.util.TreeSet;

public class Exercise03 {

	/*
	 * Write a Java program to get the number of elements in a tree set.
	 */
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("Red");
		treeSet.add("Green");
		treeSet.add("Black");
		treeSet.add("Pink");
		treeSet.add("Orange");

		System.out.println("Original tree set: " + treeSet);
		System.out.println("Size of the tree set: " + treeSet.size());
	}
}