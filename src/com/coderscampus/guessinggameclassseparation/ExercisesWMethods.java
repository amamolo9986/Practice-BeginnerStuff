package com.coderscampus.guessinggameclassseparation;

import java.util.Scanner;

public class ExercisesWMethods {

	public void validateInput() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please type a number between 50 and 300");

		int guess = scan.nextInt();
		while (guess <= 50 || guess >= 300) {
			System.out.println("That number is not between 50 and 300. Please try again.");
			guess = scan.nextInt();
		}
		System.out.println("The number you typed was " + guess);
	}
}
