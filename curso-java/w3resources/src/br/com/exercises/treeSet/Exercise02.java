package br.com.exercises.treeSet;

import java.util.TreeSet;

public class Exercise02 {

	/**
	 * Write a Java program to iterate through all elements in a array list.
	 */
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("Red");
		treeSet.add("Green");
		treeSet.add("Orange");
		treeSet.add("White");
		treeSet.add("Black");

		for(String element: treeSet) {
			System.out.println(element);
		}
	}
}