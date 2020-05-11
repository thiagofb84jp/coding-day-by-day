package br.com.exercises.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Exercise06 {

	public static void main(String[] args) {

		List<String> listStrings = new ArrayList<>();

		listStrings.add("Red");
		listStrings.add("Green");
		listStrings.add("Orange");
		listStrings.add("White");
		listStrings.add("Black");

		System.out.println(listStrings);
		
		listStrings.remove(2);
		
		System.out.println("After removing third element from the list:\n " + listStrings);		
	}
}
