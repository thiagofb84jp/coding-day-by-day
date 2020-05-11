package br.com.exercises.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise08 {

	public static void main(String[] args) {

		List<String> listStrings = new ArrayList<>();

		listStrings.add("Red");
		listStrings.add("Green");
		listStrings.add("Orange");
		listStrings.add("White");
		listStrings.add("Black");
		listStrings.add("Blue");

		System.out.println("List before shuffling:\n " + listStrings);

		Collections.shuffle(listStrings);

		System.out.println("List fater shuffling:\n " + listStrings);
	}
}