package com.main;
import com.rec.Student;
public class Main {
	
	public static void main(String args[]) {
		Student s1 = new Student(111, "Amar",22);
		System.out.println(s1);
		
		Student s2 = new Student(111, "Amir",65);
		System.out.println(s2);
		
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.name());
		
		System.out.println(s1.studentId());
		System.out.println(s1.marks());
	}
	

}
