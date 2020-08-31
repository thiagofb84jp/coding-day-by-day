package br.com.exercises.priorityQueue;

import java.util.PriorityQueue;

public class Exercise01 {
	
	/*
	 * Write a Java program to create a new priority queue, add some colors (string) and print out the elements of the priority queue.
	 */
	public static void main(String[] args) {
		PriorityQueue<String> priorityQueue = new PriorityQueue<>();
		priorityQueue.add("Red");
		priorityQueue.add("Green");
		priorityQueue.add("Orange");
		priorityQueue.add("White");
		priorityQueue.add("Black");
		
		System.out.println("Elements of the Priority Queue");
		System.out.println(priorityQueue);
	}
}