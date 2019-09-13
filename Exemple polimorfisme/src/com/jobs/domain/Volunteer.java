package com.jobs.domain;

public class Volunteer extends AbsStaffMember {
	
	private static String description;
	

	public Volunteer(String name, String address, String phone, String description) throws Exception {
		super(name, address, phone);
		
		if (description.equals(""))
			description = "Missing description";
			//System.out.println("Missing description");

		this.description = description;
		
		//TODO
	}
	
	public static String getDescription() {
		return description;
	}

	
	@Override
	public void pay() {
		//TODO
		totalPaid = 0;
	}
	
	@Override
	public String getData() {
	return "Id: " + id + "; Name: " + name + "; Address: " + address + "; Tf: " + phone + "; Description: " + description + ".";
	}
}
