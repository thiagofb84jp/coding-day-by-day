package br.com.exercises.priorityQueue;

import java.util.PriorityQueue;

public class Exercise09 {
	
	/*
	 * Write a Java program to compare two priority queues.
	 */
	public static void main(String[] args) {
		PriorityQueue<String> pq1 = new PriorityQueue<>();
		pq1.add("Red");
		pq1.add("Green");
		pq1.add("Black");
		pq1.add("White");
		pq1.add("Grey");
		pq1.add("Blue");
		
		System.out.println("First Priority Queue: " + pq1);
		
		PriorityQueue<String> pq2 = new PriorityQueue<>();
		pq2.add("Red");
		pq2.add("Pink");
		pq2.add("Black");
		pq2.add("Orange");
		pq2.add("Grey");
		pq2.add("Yellow");
		
		System.out.println("Second Priority Queue: " + pq2);
		
		for(String element: pq1) {
			System.out.println(pq2.contains(element) ? "Yes" : "No");
		}
	}
}