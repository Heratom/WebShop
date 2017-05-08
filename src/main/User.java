package main;

import java.util.Random;

public class User {
	private final int ID;
	private String username;
	private String password;
	
	public User(String username, String password) {
		Random rand = new Random();
		this.ID = rand.nextInt(1000000);
		this.username = username;
		this.password = password;
	}
}
