package com.rec;

public record Student(int studentId, String name, float marks) {
	
	public Student(int studentId, String name, float marks) {
		this.studentId=studentId;
		this.name=name.toUpperCase();
		this.marks = marks < 35? 35:marks;
	}
	
	public boolean equals(Object o) {
		
		Student s = (Student)o;
		if(this.studentId == s.studentId)
			return true;
		return false;
	}

	
	@Override
	public String toString() {
		return "StudentId: " + studentId + "\nName: " + name + "\nMarks: " + marks;
	}
}

