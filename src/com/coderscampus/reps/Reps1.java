package com.coderscampus.reps;

import java.util.Random;
import java.util.Scanner;

public class Reps1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		int randomNumber = random.nextInt(101);

		System.out.println("Pick a number between 1 and 100");


		while (true) {
			int guess = scan.nextInt();
			if (guess < 1 || guess > 100) {
				System.out.println("Haha you fool, that is not in your range.");
			} else if (guess < randomNumber) {
				System.out.println("Pick a higher number you bozo");
			} else if (guess > randomNumber) {
				System.out.println("Lower pleaseeee");
			}
			if (guess == randomNumber) {
				System.out.println("it is about time!");
			}
		}
	}
}