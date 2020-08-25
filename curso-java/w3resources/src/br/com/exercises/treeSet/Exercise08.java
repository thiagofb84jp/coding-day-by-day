package br.com.exercises.treeSet;

import java.util.TreeSet;

public class Exercise08 {
	/*
	 * Write a Java program to get an element in a tree set which is strictly less than the given element.
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
		
		System.out.println("Greater than or equal to 69: " + treeNumbers.lower(69));
		System.out.println("Greater than or equal to 12: " + treeNumbers.lower(12));
	}
}