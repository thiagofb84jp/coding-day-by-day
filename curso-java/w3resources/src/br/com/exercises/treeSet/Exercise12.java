package br.com.exercises.treeSet;

import java.util.TreeSet;

public class Exercise12 {

	/*
	 * Write a Java program to get the first and last elements in a tree set.
	 */
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("Red");
		treeSet.add("Green");
		treeSet.add("Orange");
		treeSet.add("White");
		treeSet.add("Black");

		Object firstElement = treeSet.first();
		System.out.println("First element is: " + firstElement);

		Object lastElement = treeSet.last();
		System.out.println("Last element is: " + lastElement);
	}
}