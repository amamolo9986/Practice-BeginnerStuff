package com.coderscampus.methods;

import java.util.Scanner;

public class MethodExercise {

	public static void main(String[] args) {
		MethodExercise exercise = new MethodExercise();
		Integer result = exercise.returnExercise();
		System.out.println("The number you typed was: " + result);
	}

	private Integer returnExercise() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Type a number between 50 and 300");
		int i = scan.nextInt();

		if (i < 50 || i > 300) {
			return null;
		} else {
			return i;
		}
	}
}
// This is an example of how you can execute Assignment 2 in one method, then call it into the main method.
