package com.coderscampus.staticexample;

public class TVShow {
	private String name;
	private String genre;
	
	public TVShow() {
		
	}
	
	public TVShow(String name, String genre) {
		super();
		this.name = name;
		this.genre = genre;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "TVShow [name=" + name + ", genre=" + genre + "]";
	}
	
	
}
