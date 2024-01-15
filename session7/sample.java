package com.acc;

import java.util.ArrayList;
import java.util.List;

public class sample {
	public static void main(String[] args) {
		Student s1 = new Student("Sarvesh",1,"ENTC");
		Student s2 = new Student("AJAY",2,"IT");
		Student s3 = new Student("VIJAY",3,"CSE");
		Student s4 = new Student("OMKAR",4,"ENTC");
		Student s5 = new Student("RAHUL",5,"IT");
		Student s6 = new Student("JAY",6,"CSE");
		List<Student> cse_students = new ArrayList<Student>();
		cse_students.add(s3);
		cse_students.add(s6);
		List<Student> entc_students = new ArrayList<Student>();
		entc_students.add(s1);
		entc_students.add(s4);
		List<Student> it_students = new ArrayList<Student>();
		it_students.add(s2);
		it_students.add(s5);
		
		Department CSE = new Department("CSE" , cse_students);
		Department ENTC = new Department("ENTC" , entc_students);
		Department IT = new Department("IT" , it_students);
		List<Department> departments = new ArrayList<Department>();
		departments.add(ENTC);
		departments.add(IT);
		departments.add(CSE);
		Institute institute = new Institute("jspm college", departments);
		System.out.printf("Total  Students in Jspm College:"+institute.getTotalStudentsInInstitute());
		
	}

}
