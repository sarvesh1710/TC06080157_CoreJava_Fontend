package com.acc1;

public class sample extends ABC {
	public void display() {
		System.out.println("disp() of child class");
	}
	
	public void newMethod() {
		System.out.println("didp() if parent class");
	}
	public static void main(String[] args) {
		//object of super class calling method of super class
		ABC b1 = new ABC();
		b1.display();
		//object of super class calling method of subclass class
		ABC b2 = new sample();
		b2.display();
	}

}
