package com.acc;

public class ChildClass extends ParentClass {
	public ChildClass(){
			System.out.println("This is Child class");
		}
	public ChildClass(int n) {
			super("s");
			System.out.println("This is Arg child class");
		}
	public void display() {
			System.out.println("Hello Friends");
		}
	public static void main(String[] args) {
		ChildClass ch = new ChildClass();
		ch.display();
		
		ChildClass ch1 = new ChildClass(10);
		ch1.display();
	}
	
	}

