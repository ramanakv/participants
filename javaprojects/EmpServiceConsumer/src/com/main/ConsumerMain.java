package com.main;

import java.util.ServiceLoader;

import com.entity.Employee;
import com.service.EmployeeService;

public class ConsumerMain {

	public static void main(String[] args) {

		ServiceLoader<EmployeeService> loader = ServiceLoader.load(EmployeeService.class);

		String type = "PERM";
		EmployeeService empService = null;

		for (EmployeeService s : loader) {
			if (s.getType().equals(type)) {
				empService = s;
				break;
			}
		}

		if (empService == null) {
			System.out.println("No service provider of the type " + type + " available");
			System.exit(0);
		}

		Employee x = empService.getEmployee(666);
		if (x == null)
			System.out.println("Data not found");
		else
			System.out.println(x);

		boolean saved = empService.saveEmployee(new Employee(886, "Armada", 22000));
		if (saved) {
			System.out.println("Data successfully saved");
		} else {
			System.out.println("The employee data already exists");
		}

		x = empService.getEmployee(886);
		System.out.println(x);
	}

}
