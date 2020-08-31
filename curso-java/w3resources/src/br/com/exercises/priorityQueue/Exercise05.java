package br.com.exercises.priorityQueue;

import java.util.PriorityQueue;

public class Exercise05 {
	
	/*
	 * Write a Java program to count the number of elements in a priority queue.
	 */
	public static void main(String[] args) {
		PriorityQueue<String> priorityQueue = new PriorityQueue<>();
		priorityQueue.add("Red");
		priorityQueue.add("Green");
		priorityQueue.add("Black");
		priorityQueue.add("White");
		priorityQueue.add("Grey");
		priorityQueue.add("Blue");
		
		System.out.println("Original Priority Queue: " + priorityQueue);
		
		System.out.println("The Size of Priority Queue List: " + priorityQueue.size());				
	}
}