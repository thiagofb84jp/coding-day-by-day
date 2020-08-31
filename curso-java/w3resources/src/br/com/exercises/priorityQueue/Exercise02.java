package br.com.exercises.priorityQueue;

import java.util.PriorityQueue;

public class Exercise02 {
	
	/*
	 * Write a Java program to iterate through all elements in priority queue.
	 */
	public static void main(String[] args) {
		PriorityQueue<String> priorityQueue = new PriorityQueue<>();
		priorityQueue.add("Red");
		priorityQueue.add("Green");
		priorityQueue.add("Orange");
		priorityQueue.add("White");
		priorityQueue.add("Black");
		
		System.out.println("Elements of the Priority Queue");
		
		for(String elements: priorityQueue) {
			System.out.println(elements);
		}	
	}
}