package br.com.exercises.priorityQueue;

import java.util.PriorityQueue;

public class Exercise08 {

	/*
	 * Write a Java program to retrieve and remove the first element.
	 */
	public static void main(String[] args) {
		PriorityQueue<Integer> pq1 = new PriorityQueue<>();
		
		pq1.add(5);
		pq1.add(10);
		pq1.add(22);
		pq1.add(36);
		pq1.add(25);
		pq1.add(16);
		pq1.add(70);
		pq1.add(82);
		pq1.add(89);
		pq1.add(14);
		
		System.out.println("Original Priority Queue: " + pq1);
		System.out.println("Original Priority Queue: " + pq1.poll());
		System.out.println("Priority Queue after removing first element: " + pq1);
	}
}