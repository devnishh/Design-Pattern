package com.jspider.DesingPattern.Creational;

public class Contact {

	private String Name;
	private String lastaName;
	private String Company;
	private String title;
	private long mobile;
	private String work;
	private String groups;

	public Contact(String name, String lastaName, String company, String title, long mobile, String work,
			String groups) {
		super();
		Name = name;
		this.lastaName = lastaName;
		Company = company;
		this.title = title;
		this.mobile = mobile;
		this.work = work;
		this.groups = groups;
		
		
	}

	@Override
	public String toString() {
		return "Contact [Name=" + Name + ", lastaName=" + lastaName + ", Company=" + Company + ", title=" + title
				+ ", mobile=" + mobile + ", work=" + work + ", groups=" + groups + "]";
	}

}
