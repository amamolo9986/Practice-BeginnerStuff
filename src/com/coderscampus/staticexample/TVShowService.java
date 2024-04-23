package com.coderscampus.staticexample;

public class TVShowService {
	
	
	public TVShow nonStaticMethod(TVShow tvShow) {
		tvShow = new TVShow("The Office", "Comedy");
		return tvShow;
	}
	
	public static TVShow staticMethod(TVShow tvShow) {
		tvShow = new TVShow("What we do in the Shadows", "Comedy");
		return tvShow;
	}
}
