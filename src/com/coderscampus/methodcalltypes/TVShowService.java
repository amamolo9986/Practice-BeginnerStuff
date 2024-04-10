package com.coderscampus.methodcalltypes;

public class TVShowService {
	
public TVShow show(String name, String genre, int yearsActive) {
		
		TVShow tvShow = new TVShow(name, genre, yearsActive);
		System.out.println(name + " is a " + genre + " tv show that has " + yearsActive + " seasons.");
		
		return tvShow;

	}

}
