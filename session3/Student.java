package TNS;

import java.util.Scanner;

public class Student {
	public int id;
	public String name;
	public float marks;
	public int date;
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public float getMarks() {
//		return marks;
//	}
//	public void setMarks(float marks) {
//		this.marks = marks;
//	}
//	public int getDate() {
//		return date;
//	}
//	public void setDate(int date) {
//		this.date = date;
//	}
	Scanner sc=new Scanner(System.in);
	public void getdata() {
		System.out.println("ID:");
		id=sc.nextInt();
		System.out.println("Name:");
		name=sc.next();
		System.out.println("Marks:");
		marks=sc.nextInt();
	}
	
	public void dispdata() {
		System.out.println(id+" "+name+" "+marks);
	}
	public void result() {
		if(marks>=35) {
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
	}
	

}

