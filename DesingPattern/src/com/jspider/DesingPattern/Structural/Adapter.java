package com.jspider.DesingPattern.Structural;

public class Adapter extends Players implements Team{

	@Override
	public void events() {
		System.out.println(getName()+"is maneger of events ");
	}

}
