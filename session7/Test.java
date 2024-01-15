package com.acc;

public class Test {
	public static void main(String[] args) {
	Overload o = new Overload();
	
	System.out.println(o.method1(12,23));
	System.out.println(o.method1(12,23,23));
	
	System.out.println(o.method2(12,23.4f));
	System.out.println(o.method2(12.2f,23));
	
	System.out.println(o.method3(12.43f,23));
	System.out.println(o.method3(12.45f,23.0f));

}
}
