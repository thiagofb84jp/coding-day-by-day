package br.com.exercises.inputAndOutput;

public class Exercise04 {

	public static void main(String[] args) {
		String string1 = "Java exercises";
		String string2 = "Java exercises";
		String string3 = "Java examples";

		int var1 = string1.compareTo(string2);
		System.out.println("string1 & string2 comparison: " + var1);

		int var2 = string1.compareTo(string3);
		System.out.println("string1 & string3 comparison: " + var2);
	}
}