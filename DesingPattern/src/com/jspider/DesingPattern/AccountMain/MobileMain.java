package com.jspider.DesingPattern.AccountMain;

import java.util.Scanner;

import com.jspider.DesingPattern.Creational.Iphone;
import com.jspider.DesingPattern.Creational.Mobile;
import com.jspider.DesingPattern.Creational.Nokia;
import com.jspider.DesingPattern.Creational.ReadmeNot7pro;
import com.jspider.DesingPattern.Creational.Samsung;

public class MobileMain {
	public static void main(String[] args) {
		try {
			Moble_Factory().order();
		} catch (Exception e) {
			System.out.println("Mobile is not orderd");
		}
	}

	public static Mobile Moble_Factory() {
		System.out.println(
		"Enter 1 for Iphone\n" 
		+ "Enter 2 for Nokia\n" 
		+ "Enter 3 for ReadME\n"
		+ "Enter 4 for Samsung");
		System.out.println("Enter your choice");
		Scanner scanner = new Scanner(System.in);
		int Choice = scanner.nextInt();
		scanner.close();
		Mobile mobile = null;
		switch (Choice) {
		case 1:
			mobile = new Iphone();
			break;
		case 2:
			mobile = new Nokia();
			break;
		case 3:
			mobile = new ReadmeNot7pro();
			break;
		case 4:
			mobile = new Samsung();
			break;

		default:
			System.err.println("Invid input");
			break;
		}
		return mobile;

	}

}
