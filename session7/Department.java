package com.acc;
import java.util.*;
public class Department {
	String name;
	List <Student> Students;
	public Department(String name, List<Student> students) {
		super();
		this.name = name;
		this.Students = students;
	}
	public <Students> List<Student> getStudents(){
		return Students;
	}
	
	

}
