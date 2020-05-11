package br.com.exercises.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise10 {

	public static void main(String[] args) {

		List<String> listStrings = new ArrayList<>();

		listStrings.add("Red");
		listStrings.add("Green");
		listStrings.add("Orange");
		listStrings.add("White");
		listStrings.add("Black");
		listStrings.add("Blue");
		
		Collections.sort(listStrings);
		
		System.out.println("List before reversing:\n" + listStrings);
		
		Collections.reverse(listStrings);
		
		System.out.println("List after reversing:\n" + listStrings);
	}
}