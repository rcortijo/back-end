package com.jobs.application;

import com.jobs.domain.AbsStaffMember;
import com.jobs.domain.BossEmployee;
import com.jobs.domain.Employee;
import com.jobs.domain.ManagerEmployee;
import com.jobs.domain.Volunteer;
import com.jobs.persistence.EmployeeRepository;
import java.util.Iterator;
import java.util.List;

public class JobsController {

    private EmployeeRepository repository;

    public JobsController() {
        repository = new EmployeeRepository();
    }

    public void createManagerEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception {
        ManagerEmployee boss = new ManagerEmployee(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateManager());
        repository.addMember(boss);
    }

    public void createBossEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception {
        BossEmployee boss = new BossEmployee(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateBoss());
        repository.addMember(boss);
    }

    public void createEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception {
        Employee employee = new Employee(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateEmployee());
        repository.addMember(employee);
    }

    public void createVolunteer(String name, String address, String phone, double salaryPerMonth) throws Exception {
        Volunteer boss = new Volunteer(name, address, phone, salaryPerMonth);
        repository.addMember(boss);

    }

    public void payAllEmployeers2() {
        for(AbsStaffMember staff :repository.getAllMembers()){
            staff.pay();
        }        
    }

    public String getAllEmployees2() {
        StringBuilder stb = new StringBuilder();
        for(AbsStaffMember staff :repository.getAllMembers()){
            stb.append( "Cargo: " + staff.getClass().getName().substring(16) + " Id: " + staff.getId() + ", Name: " + staff.getName() + ", Address: " + staff.getAddress() + ", Phone: " + staff.getPhone() + ", Salary:" + staff.getTotalPaid() + "\n");
        } 
        return stb.toString();
    }

    public void deleteEmployee(int id) throws Exception {
        for(AbsStaffMember staff :repository.getAllMembers()){
            if(staff.getId() == id){
                repository.removeMember(staff);
            }
        }
    }
  
}
