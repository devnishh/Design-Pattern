package com.jspider.DesingPattern.AccountMain;

import com.jspider.DesingPattern.Creational.Account;
//Lazy instantion//
public class AccountMain {
	public static void main(String[] args) {
		Account account1 = Account.getObject();
		System.out.println(account1);
		Account account2 = Account.getObject();
		System.out.println(account2);
		Account account3 = Account.getObject();
		System.out.println(account3);
		Account account4 = Account.getObject();
		System.out.println(account4);
	}
}
