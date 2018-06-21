package com.jobs.application;

import com.jobs.domain.AbsStaffMember;

public class StaffDTO {
    
    private int id;
    private String name;
    private String address;
    private String phone;
    private double totalPaid=0.0d;
    
    public StaffDTO(AbsStaffMember staff){
        this.id = staff.getId();
        this.name = staff.getName();
        this.address = staff.getAddress();
        this.phone = staff.getPhone();
        this.totalPaid = staff.getTotalPaid();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public double getTotalPaid() {
        return totalPaid;
    }
    
}
