package br.com.exercises.priorityQueue;

import java.util.PriorityQueue;

public class Exercise10 {
	
	/*
	 * Write a Java program to add all the elements of a priority queue to another priority queue.
	 */
	public static void main(String[] args) {
		PriorityQueue<String> pq1 = new PriorityQueue<>();
		pq1.add("Red");
		pq1.add("Green");
		pq1.add("Orange");
		System.out.println("First Priority Queue: " + pq1);
		
		PriorityQueue<String> pq2 = new PriorityQueue<>();
		pq2.add("Pink");
		pq2.add("White");
		pq2.add("Black");
		System.out.println("Second Priority Queue: " + pq2);
		
		pq1.addAll(pq2);
		
		System.out.println("New Priority Queue: " + pq1);
	}
}