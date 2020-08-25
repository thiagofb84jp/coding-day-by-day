package br.com.exercises.treeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class Exercise15 {
	
	/*
	 * Write a Java program to create a reverse order view of the elements contained in a given tree set.
	 */
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("Red");
		treeSet.add("Green");
		treeSet.add("Black");
		treeSet.add("Pink");
		treeSet.add("orange");
		System.out.println("Original Tree Set: " + treeSet);
		
		Iterator<String> iterator = treeSet.descendingIterator();
		
		System.out.println("Elements in reverse order: ");
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}