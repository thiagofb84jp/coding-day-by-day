package br.com.exercises.treeSet;

import java.util.TreeSet;

public class Exercise04 {
	/*
	 * Write a Java program to find the numbers less than 7 in a tree set.
	 */
	public static void main(String[] args) {
		TreeSet<Integer> treeNumbers = new TreeSet<>();
		TreeSet<Integer> treeHeadSet = new TreeSet<>();
		
		for(int i = 1; i <= 10; i++) {
			treeNumbers.add(i);
		}
		
		treeHeadSet = (TreeSet<Integer>) treeNumbers.headSet(7);
		
		System.out.println("Tree set data: ");
		
		for(Integer elements: treeHeadSet) {
			System.out.println(elements);
		}		
	}
}