package com.coderscampus.reps;

import java.util.Random;
import java.util.Scanner;

public class Reps2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		int randomNumber = random.nextInt(101);

		System.out.println("Guess a number between 1 and 100");
		//System.out.println(randomNumber);


		while (true) {
			int guess = scan.nextInt();

			if (guess < 1 || guess > 100) {
				System.out.println("Can you read? 1-100 lol");
			} else if (guess < randomNumber) {
				System.out.println("Your guess was too low, pick a higher number");
			} else if (guess > randomNumber) {
				System.out.println("Your guess was too high, pick a lower number");
			}

			if (guess == randomNumber) {
				System.out.println("Its about time!");
				break;
			}
		}

	}

}