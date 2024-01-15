package com.acc;

import java.util.List;

public class Institute {
	String instituteName;
	List<Department> departments;
	public Institute(String instituteName, List<Department> departments) {
		super();
		this.instituteName = instituteName;
		this.departments = departments;
	}
	public int getTotalStudentsInInstitute() {
		int noOfStudents = 0;
		List<Student> students;
		for(Department dept:departments) {
			students = dept.getStudents();
			for(Student student:students) {
				noOfStudents++;
			}
		}
		return noOfStudents;
	}
}
