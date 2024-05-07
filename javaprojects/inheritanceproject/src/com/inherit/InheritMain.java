package com.inherit;

public class InheritMain {

	public static void main(String[] args) {

		Employee e = new Employee("Srinidhi", "Hyderabad", 100, 34000);

		handleObjects(e);

		Student s = new Student("Sudhir", "Chennai", 11, 30); // displayDetails() of Student class
		handleObjects(s);

	}

//	static void handleObjects(Person p) {
//
//		p.displayDetails();
//
//		if (p instanceof Employee e) {
//
//			System.out.println(e.getClass().getName());
//			System.out.println("Allowance: " + e.getAllowance());
//		}
//
//		if (p instanceof Student s) {
//		
//			System.out.println(s.getClass().getName());
//			s.showResult();
//		}
//	}

	static void handleObjects(Person p) {

		p.displayDetails();

		switch (p) {

		case Employee e:
			System.out.println(e.getClass().getName());
			System.out.println("Allowance: " + e.getAllowance());
			break;

		case Student s:
			System.out.println(s.getClass().getName());
			s.showResult();
			break;
			default: System.out.println("==============");
		}
	}
}
