package com.coderscampus.arrays;

public class UserService {

	public User createUser(String name, String username, String password) {
		User user = new User();
		user.setName(name);
		user.setUsername(username);
		user.setPassword(password);
		return user;

	}

}
