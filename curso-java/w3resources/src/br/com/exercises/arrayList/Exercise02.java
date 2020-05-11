package br.com.exercises.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Exercise02 {

	public static void main(String[] args) {

		List<String> listStrings = new ArrayList<>();

		listStrings.add("Red");
		listStrings.add("Green");
		listStrings.add("Orange");
		listStrings.add("White");
		listStrings.add("Black");

		for (String elements : listStrings) {
			System.out.println(elements);
		}
	}
}
