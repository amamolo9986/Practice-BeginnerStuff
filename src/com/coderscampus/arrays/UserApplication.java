package com.coderscampus.arrays; 

public class UserApplication {

	public static void main(String[] args) {
		UserService userService = new UserService();

		User[] users = new User[3];
		for (int i = 0; i < 3; i++) {
			users[i] = userService.createUser("name" + (i + 1), "user" + (i + 1), "password" + (i + 1));
			
			System.out.println(users[i]);
		}

//		users[0] = userService.createUser("name", "user1", "password1");
//		users[1] = userService.createUser("name", "user2", "password2");
//		users[2] = userService.createUser("name", "user3", "password3");
//		
//		System.out.println(users[0]);
//		System.out.println(users[1]);
//		System.out.println(users[2]);
		
//		We can wither hard code like this ^^ or use a loop
	}
}
