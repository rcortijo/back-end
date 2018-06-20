package com.jobs.domain;

public class Volunteer extends AbsStaffMember {
	        
	public Volunteer(String name, String address, String phone,double salaryPerMonth) throws Exception {
		super(name, address, phone,salaryPerMonth);
	}

	
	@Override
	public void pay() {
		//TODO
		
	}

}
