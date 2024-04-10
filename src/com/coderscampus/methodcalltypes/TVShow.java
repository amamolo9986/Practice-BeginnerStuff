package com.coderscampus.methodcalltypes;

public class TVShow {
	private String name;
	private String genre;
	private int yearsActive;

	public TVShow() {
	}
	
	public TVShow(String name, String genre, int yearsActive) {
		super();
		this.name = name;
		this.genre = genre;
		this.yearsActive = yearsActive;
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

	public int getYearsActive() {
		return yearsActive;
	}

	public void setYearsActive(int yearsActive) {
		this.yearsActive = yearsActive;
	}

	@Override
	public String toString() {
		return "TVShow [name=" + name + ", genre=" + genre + ", yearsActive=" + yearsActive + "]";
	}

}
