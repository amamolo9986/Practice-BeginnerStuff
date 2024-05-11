package com.coderscampus.maps;

import java.util.HashMap;
import java.util.Map;

public class MapExercise {

	public static void main(String[] args) {

		Map<Integer, String> people = new HashMap<>();

		people.put(1, "Person1");
		people.put(2, "Person2");
		people.put(3, "Person3");
		//Initialize a map and add K/V pairs to it with .put() method
		
		

		System.out.println(people);
		
		System.out.println();
		System.out.println("See how it prints with only the people variable");
		System.out.println("-=-=-=-=-=-=-=-");
		
		

		for (Integer key : people.keySet()) {
			System.out.println(key);
		}
		
		System.out.println();
		System.out.println("See how to loop through keys above");
		System.out.println("-=-=-=-=-=-=-=-");
		
		

		for (String value : people.values()) {
			System.out.println(value);
		}
		
		System.out.println();
		System.out.println("See how to loop through values above");
		System.out.println("-=-=-=-=-=-=-=-");
		
		

		people.put(3, "New Person3");

		System.out.println(people.get(2));
		System.out.println(people.get(3));
		
		System.out.println();
		
		System.out.println("If a new value is assigned to the same key, the existing value updates");
		System.out.println("Person3 becomes New Person3");
		System.out.println("-=-=-=-=-=-=-=-");

		

		if (people.containsKey(1) && people.containsKey(2)) {
			people.put(12, people.get(1) + people.get(2));
			for (String value : people.values()) {
				System.out.println(value);
			}
			
			System.out.println();
			System.out.println("If the map contains values in key positions 1 & 2, combine them");
			System.out.println("We are still using the .put() method, but the value is concatonated");
			System.out.println("Then we create a for loop to print the new values");
		}
	}

}
