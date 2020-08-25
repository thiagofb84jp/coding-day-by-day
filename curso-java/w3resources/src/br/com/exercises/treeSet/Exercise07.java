package br.com.exercises.treeSet;

import java.util.TreeSet;

public class Exercise07 {
	/*
	 * Write a Java program to get an element in a tree set which is strictly greater than the given element.
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
		
		System.out.println("Greater than or equal to 76: " + treeNumbers.floor(86));
		System.out.println("Greater than or equal to 31: " + treeNumbers.floor(31));
	}
}