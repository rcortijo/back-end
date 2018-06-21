package com.jobs.view;

import com.jobs.application.JobsController;
import com.jobs.application.StaffDTO;
import java.util.List;

public class Main {

	private static JobsController controller=new JobsController();
	
	public static void main(String[] args) throws Exception {
		
		StaffDTO boss = controller.createBossEmployee("Pepe Boss", "Dirección molona", "666666666", 100.0);
                controller.createBossEmployee("Juan Boss", "Dirección molona", "7777777", 200.0);
                controller.createBossEmployee("Roger Boss", "Dirección molona", "88888888", 250.0);
		controller.createEmployee("Pedro Employee", "Dirección molona 2", "665266666", 40.0);
		controller.createEmployee("Laura Employee", "Dirección molona 3", "625266666", 45.0);
		controller.createVolunteer("Juan Volunteer", "Dirección molona 4", "614266666",0);
		controller.createManagerEmployee("Pedro Employee", "Dirección molona 2", "665226666", 80.0);
		
                getEmployees();
		
                System.out.println("CALCULATING PAYMENTS... \n");
                controller.payAllEmployeers2();
		
                getEmployees();
		
                System.out.println("ELIMINATING 3 EMPLOYEES... \n");
                controller.deleteEmployee(1);
                controller.deleteEmployee(2);
                controller.deleteEmployee(3);
                controller.deleteEmployee(4);

                getEmployees();
                
	}

        public static void getEmployees(){
            List<StaffDTO> dtos=controller.getAllEmployees2();
            System.out.println("EMPLOYEES:\n");
            dtos=controller.getAllEmployees2();
            for(StaffDTO staff :dtos){
                System.out.println("Id: " + staff.getId() + ", Name: " + staff.getName() + ", Address: " + staff.getAddress() + ", Phone: " + staff.getPhone() + ", Salary:" + staff.getTotalPaid() + "\n");
            }
        }
}
