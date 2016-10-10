package com.nuigalway.ct417_assignment1_classes;

import org.joda.time.DateTime;

public class Student {
	
	public String name;
	public int ID, age;
	public DateTime dob;
	private CourseProgramme course;
	
	public Student(String name, int age, DateTime dob, int studentID, CourseProgramme course) {
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.ID = studentID;
		this.course = course;
		course.addStudent(this);
	}
	
	public String getUsername() {
		String username;
		username = name + age;
		return username;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", ID=" + ID + ", age=" + age + ", dob=" + dob + ", username=" + getUsername()
				+ " courseInfo: " + course.toString() + "]";
	}
	
	public CourseProgramme getCourse() {
		return course;
	}
	
}
