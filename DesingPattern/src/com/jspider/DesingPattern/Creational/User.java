package com.jspider.DesingPattern.Creational;

public class User {
	private static User user = new User();
	private User() {
		System.out.println("constructer is invoked");
	}
	public static User getObject() {
		// TODO Auto-generated method stub
		return user;
	}
}
