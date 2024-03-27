package com.jspider.DesingPattern.Creational;

public class Account {
	private static Account account;

	public Account() {
		System.out.println("Constructer is invoked");
	}
	public static Account getObject() {
		if (account==null) {
			account = new Account();
		} 

		return account;
	}
	
}
