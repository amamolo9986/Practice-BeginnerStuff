package com.coderscampus.scanner;

import java.util.Scanner;

public class ScannerPractice {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Who's this?");
		String name = scan.nextLine();
		
		System.out.println("What do you want?");
		String reason = scan.nextLine();
		
		System.out.println("hi " + name + " and you want " + reason + "? LOL good luck with that.");
	}

}
