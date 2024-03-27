package com.jspider.DesingPattern.AccountMain;

import com.jspider.DesingPattern.Creational.Contact;
import com.jspider.DesingPattern.Creational.ContactBuilder;

public class ContactMain {
	public static void main(String[] args) {
		Contact contact = new ContactBuilder().setName("nisahnt").setLastaName("girase").setTitle("mr")
				.contactBuilderContact();
		System.out.println(contact);
		
	}
}
