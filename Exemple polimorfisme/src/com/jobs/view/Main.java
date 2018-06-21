package com.jobs.view;

import com.jobs.application.JobsController;

public class Main {

	private static JobsController controller=new JobsController();
	
	public static void main(String[] args) throws Exception {
		
		controller.createBossEmployee("Pepe Boss", "Dirección molona", "666666666", 100.0);
                controller.createBossEmployee("Juan Boss", "Dirección molona", "7777777", 200.0);
                controller.createBossEmployee("Roger Boss", "Dirección molona", "88888888", 250.0);
		controller.createEmployee("Pedro Employee", "Dirección molona 2", "665266666", 40.0);
		controller.createEmployee("Laura Employee", "Dirección molona 3", "625266666", 45.0);
		controller.createVolunteer("Juan Volunteer", "Dirección molona 4", "614266666",0);
		controller.createManagerEmployee("Pedro Employee", "Dirección molona 2", "665226666", 80.0);
		
		String allEmployees=controller.getAllEmployees2();
                System.out.println("EMPLOYEES: \n" + allEmployees + " \n");
		
                System.out.println("CALCULATING PAYMENTS... \n");
                controller.payAllEmployeers2();
		
                allEmployees=controller.getAllEmployees2();
		System.out.println("EMPLOYEES: \n" + allEmployees + " \n");
		
                System.out.println("ELIMINATING 2 EMPLOYEES... \n");
                controller.deleteEmployee(1);
                controller.deleteEmployee(2);
                
                allEmployees=controller.getAllEmployees2();
		System.out.println("EMPLOYEES: \n" + allEmployees + " \n");
	}

}
