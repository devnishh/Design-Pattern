package com.jspider.DesingPattern.AccountMain;

import com.jspider.DesingPattern.Creational.User;
//Eager instation//
public class UserMain {
	public static void main(String[] args) {
		User user = User.getObject();
		System.out.println(user);
		User user1 = User.getObject();
		System.out.println(user1);
		User user2 = User.getObject();
		System.out.println(user2);
		User user3 = User.getObject();
		System.out.println(user3);
		
	}
}
