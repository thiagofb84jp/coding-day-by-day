package br.com.exercises.treeSet;

import java.util.TreeSet;

public class Exercise06 {
	
	/*
	 * Write a Java program to get the element in a tree set which is less than or equal to the given element.
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
		
		System.out.println("Greater than or equal to 86: " + treeNumbers.floor(86));
		System.out.println("Greater than or equal to 29: " + treeNumbers.floor(29));
	}
}