package com.nuigalway.ct417_assignment1_classes;

import java.util.ArrayList;
import java.util.Arrays;

import org.joda.time.DateTime;

public class CourseProgramme {
	
	public String courseName;
	ArrayList<Module> moduleList = new ArrayList<Module>();
	public DateTime startDate, endDate;
	
	public CourseProgramme(String courseName, DateTime startDate, DateTime endDate) {
		this.courseName = courseName;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		StringBuilder modulesAsString = new StringBuilder();
		
		for (int i=0; i<moduleList.size(); i++) {
			modulesAsString.append(moduleList.get(i).getName());
			if (i != moduleList.size() -1) {
				modulesAsString.append(", ");
			}
		}
		
		return "[courseName=" + courseName + ", moduleList=" + "[" + modulesAsString.toString() + "]"
				+ ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}
	
	public void addModule(Module mod) {
           moduleList.add(mod);
        }
	
	public void addStudent(Student student) {
		for (Module module : moduleList)
			module.addStudent(student);
	}
	
}
