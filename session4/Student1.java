package package1;

import java.io.Serializable;

public class Student1 implements Serializable{
	
	private int rollNo;
	private String name;
	private transient float fees;
	
	public Student1() {}

	public Student1(int rollNo, String name, float fees) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", fees=" + fees + "]";
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Student1 s=new Student1(2,"Aishwarya",1200.0f);
		Student1 s1=(Student1)s.clone();
		System.out.println(s1);

	}

}
