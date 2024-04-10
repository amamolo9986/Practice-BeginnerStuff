package com.coderscampus.methodcalltypes;

public class MainApplication {
	
public static void main(String[] args) {
		
		TVShow tvShow1 = new TVShow();
		tvShow1.setName("Parks and Rec");
		tvShow1.setGenre("Comedy");
		tvShow1.setYearsActive(7);
		System.out.println(tvShow1);
		System.out.println("tvShow1 sets our values using only the setters in our pojo.");
		System.out.println("");
		
		//This code is a good use case as for why we want a no args constructor along with our regular constructor
		
		//When we say TVShow tvShow1 = new TvShow(); in line 7
		//		This TvShow is our constructor ^^^
		//There arent any arguments passed through.
		//But if you look at the code below in line 25, we pass in our values using the constructor that has args.
		
		//So when we create an args constructor, we are saying that the constructor should ONLY ever have arguments passed through
		//But when we add the no arg constructor, we are telling it that we can have both args AND no args.
		
		//you can see for yourself how this works by commenting out the constructor that contains args/no args
		//in the TV Show class to see the compilation errors that happen in this class
		
		TVShow tvShow2 = new TVShow("The Office", "Comedy", 9);
		System.out.println(tvShow2);
		System.out.println("tvShow2 sets our values using our constructor in the pojo.");
		System.out.println("");
		
		TVShowService showService = new TVShowService();
		TVShow tvShow3 = showService.show("Bobs Burgers", "Comedy", 13);
		System.out.println(tvShow3);
		System.out.println("tvShow3 sets our values using the method we created in our TVShowService.'");
		System.out.println("");
		
	}

}
