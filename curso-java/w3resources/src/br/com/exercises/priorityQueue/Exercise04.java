package br.com.exercises.priorityQueue;

import java.util.PriorityQueue;

public class Exercise04 {
	
	/*
	 * Write a Java program to remove all the elements from a priority queue.
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
		
		priorityQueue.clear();
		
		System.out.println("The New Priority Queue: " + priorityQueue);		
	}
}