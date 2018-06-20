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
	
	public JobsController(){
		repository = new EmployeeRepository();
	}

	public void createManagerEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{
		ManagerEmployee boss = new ManagerEmployee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateManager());
                repository.addMember(boss);
	}
        public void createBossEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		BossEmployee boss = new BossEmployee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateBoss());
                repository.addMember(boss);
	}
        public void createEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Employee employee = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateEmployee());
		repository.addMember(employee);
	}
         public void createVolunteer(String name, String address, String phone,double salaryPerMonth) throws Exception{
		Volunteer boss = new Volunteer(name, address, phone,salaryPerMonth);
		repository.addMember(boss);
		
	}

         
	public void payAllEmployeers() {
            StringBuilder stb = new StringBuilder();
            List<AbsStaffMember> listaMembers = repository.getAllMembers();
            Iterator it = listaMembers.iterator();
           
            while(it.hasNext()){
                AbsStaffMember obj = (AbsStaffMember) it.next();
                obj.pay();
            }
	}
	public String getAllEmployees() {
                StringBuilder stb = new StringBuilder();
		List<AbsStaffMember> listaMembers = repository.getAllMembers();
                Iterator it = listaMembers.iterator();
                int i=1;
                while(it.hasNext()){
                    AbsStaffMember obj = (AbsStaffMember) it.next();
                    stb.append(i+".- Cargo: "+obj.getClass().getName().substring(16)+" Id: "+obj.getId()+", Name: "+obj.getName()+", Address: "+obj.getAddress()+", Phone: "+obj.getPhone()+", Salary:"+obj.getTotalPaid()+"\n");
                    i++;
                }
		return stb.toString();
	}

}
