package br.com.exercises.treeSet;

import java.util.TreeSet;

public class Exercise11 {
	/*
	 * Write a Java program to clone a tree set list to another tree set.
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("Red");
		treeSet.add("Green");
		treeSet.add("Black");
		treeSet.add("Pink");
		treeSet.add("Orange");
		
		System.out.println("Original tree set: " + treeSet);
		
		TreeSet<String> clonedTreeSet = (TreeSet<String>) treeSet.clone();
		System.out.println("Cloned tree list: " + clonedTreeSet);
	}
}