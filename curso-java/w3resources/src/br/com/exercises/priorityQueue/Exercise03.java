package br.com.exercises.priorityQueue;

import java.util.PriorityQueue;

public class Exercise03 {
	
	/*
	 * Write a Java program to insert a given element into a priority queue.
	 */
	public static void main(String[] args) {
		PriorityQueue<String> priorityQueue = new PriorityQueue<>();
		priorityQueue.add("Red");
		priorityQueue.add("Green");
		priorityQueue.add("Black");
		priorityQueue.add("White");
		priorityQueue.add("Grey");
		
		System.out.println("Original Priority Queue: " + priorityQueue);
		
		priorityQueue.offer("Blue");
		
		System.out.println("The New Priority Queue: " + priorityQueue);
	}
}