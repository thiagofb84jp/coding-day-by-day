package br.com.exercises.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise09 {

	public static void main(String[] args) {

		List<String> listStrings = new ArrayList<>();

		listStrings.add("Red");
		listStrings.add("Green");
		listStrings.add("Orange");
		listStrings.add("White");
		listStrings.add("Black");
		listStrings.add("Blue");
		
		System.out.println("List before sort: " + listStrings);

		Collections.sort(listStrings);

		System.out.println("List after sort: " + listStrings);
	}
}