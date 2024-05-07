package com.inherit;

public class Employee extends Person {
	private int empId;
	private int salary;

	public Employee(String name, String address, int empId, int salary) {
		super(name, address);
		this.empId = empId;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public void displayDetails() {
		System.out.println("Emp Id: " + empId);
		System.out.println("Name: " + getName());
		System.out.println("Address: " + getAddress());
		System.out.println("Salary: " + salary);

	}

	public double getAllowance() {
		return salary * 0.1;
	}

}
