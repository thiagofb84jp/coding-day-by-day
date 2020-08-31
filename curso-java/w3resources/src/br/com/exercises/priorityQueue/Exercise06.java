package br.com.exercises.priorityQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Exercise06 {
	
	/*
	 * Write a Java program to convert a priority queue to an array containing all of the elements of the queue.
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
		
		List<String> arrayList = new ArrayList<>(priorityQueue);
		System.out.println("Array containing all of the elements in the queue: " + arrayList);
	}
}