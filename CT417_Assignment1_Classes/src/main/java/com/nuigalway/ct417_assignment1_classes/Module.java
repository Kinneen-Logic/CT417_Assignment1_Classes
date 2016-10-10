package com.nuigalway.ct417_assignment1_classes;

import java.util.ArrayList;

public class Module {
	
	private String name, ID;
	private ArrayList<Student> studentList = new ArrayList<Student>();
	
	public Module(String name, String ID){
		this.name = name;
		this.ID = ID;
	}
        
    public void addStudent(Student stud) {
        studentList.add(stud);
    }
	
    public String getName() {
    	return name;
    }
    
    public String getID() {
    	return ID;
    }
    
}
