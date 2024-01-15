package com.acc;

public class Overload {
	
	
	public int method1(int a , int b) {
		return a+b;
	}
	public int method1(int c, int d, int e) {
		return c + d +e;
	}
	
	
	public float method2(int p , float q) {
		return p+q;
	}
	public float method2(float r , int s) {
		return r+s;
	}
	
	public float method3(float a , int b) {
		return a+b;
	}
	public float method3(float a , float b) {
		return a+b;
	}
	
}
