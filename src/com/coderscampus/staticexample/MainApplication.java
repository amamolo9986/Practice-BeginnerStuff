package com.coderscampus.staticexample;

public class MainApplication {

	public static void main(String[] args) {
		TVShow tvShow = new TVShow();
		TVShowService tvShowService = new TVShowService();
		
		TVShow printNonStaticShow = tvShowService.nonStaticMethod(tvShow);
		System.out.println(printNonStaticShow);
		
		TVShow printStaticShow = TVShowService.staticMethod(tvShow);
		System.out.println(printStaticShow);
	}

}
