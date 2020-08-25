package br.com.exercises.treeSet;

import java.util.TreeSet;

public class Exercise01 {
	/*
	 * Write a Java program to create a new tree set, add some colors (string) and print out the tree set.
	 */
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("Red");
		treeSet.add("Green");
		treeSet.add("Orange");
		treeSet.add("White");
		treeSet.add("Black");

		System.out.println("Tree set: ");
		System.out.println(treeSet);
	}
}