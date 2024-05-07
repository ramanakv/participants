package com.entity;

import java.util.Objects;

public class Student {

	private int studentId;
	private String name;
	private float marks;
	
	public Student(int studentId, String name, float marks) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.marks = marks;
	}
	
	public int getStudentId() {
		return studentId;
	}

	public String getName() {
		return name;
	}


	public float getMarks() {
		return marks;
	}

	@Override
	public int hashCode() {
		return Objects.hash(marks, name, studentId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Float.floatToIntBits(marks) == Float.floatToIntBits(other.marks) && Objects.equals(name, other.name)
				&& studentId == other.studentId;
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
}
