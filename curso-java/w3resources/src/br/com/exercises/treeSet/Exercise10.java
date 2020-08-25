package br.com.exercises.treeSet;

import java.util.TreeSet;

public class Exercise10 {

	/*
	 * Write a Java program to retrieve and remove the last element of a tree set.
	 */
	public static void main(String[] args) {
		TreeSet<Integer> treeNumbers = new TreeSet<>();
		treeNumbers.add(10);
		treeNumbers.add(22);
		treeNumbers.add(36);
		treeNumbers.add(25);
		treeNumbers.add(16);
		treeNumbers.add(70);
		treeNumbers.add(82);
		treeNumbers.add(89);
		treeNumbers.add(14);
		
		System.out.println("Original tree set: " + treeNumbers);
		System.out.println("Removes the last element: " + treeNumbers.pollLast());
		System.out.println("Tree set after removing last element: " + treeNumbers);
	}
}