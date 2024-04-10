package com.coderscampus.pojo;

public class User {

	// instance variables
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private int unsuccessfulLoginAttempts;

	// now we set our getters and setters
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getUnsuccessfulLoginAttempts() {
		return unsuccessfulLoginAttempts;
	}

	public void setUnsuccessfulLoginAttempts(int unsuccessfulLoginAttempts) {
		this.unsuccessfulLoginAttempts = unsuccessfulLoginAttempts;
	}

}

// what a user class is, is typically a type of object that stores data.
//There are properties that they maintain as well, these are the properties that you see above.

// and these are instance variables because they belong to the instance of a user
// meaning that they are not class variables. If they were class variables they would be static,
// meaning that every user would have the same credentials. which is CRAZY.
        // but i think that this gives me a better understanding of the static keyword too.

