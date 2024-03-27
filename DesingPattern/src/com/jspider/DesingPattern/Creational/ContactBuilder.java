package com.jspider.DesingPattern.Creational;

public class ContactBuilder {

	private String Name;
	private String lastaName;
	private String Company;
	private String title;
	private long mobile;
	private String work;
	private String groups;

	public ContactBuilder setName(String name) {
		Name = name;
		return this;
	}

	public ContactBuilder setLastaName(String lastaName) {
		this.lastaName = lastaName;
		return this;

	}

	public ContactBuilder setCompany(String company) {
		Company = company;
		return this;

	}

	public ContactBuilder setTitle(String title) {
		this.title = title;
		return this;

	}

	public ContactBuilder setMobile(long mobile) {
		this.mobile = mobile;
		return this;

	}

	public ContactBuilder setWork(String work) {
		this.work = work;
		return this;

	}

	public ContactBuilder setGroups(String groups) {
		this.groups = groups;
		return this;

	}
	public Contact contactBuilderContact() {
		return new Contact(Name, lastaName, Company, title, mobile, work, groups);
	}
}
