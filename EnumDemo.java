package com.acc1;

public class EnumDemo {
	public enum Season{WINTER,SPRING,SUMMER,FALL}
	public static void main(String[] args) {
		for(Season s : Season.values() ) {
			System.out.println(s);
		}
		System.out.println("Value of SPRING is : "+ Season.valueOf("SPRING"));
		System.out.println("Value of SPRING is : "+ Season.valueOf("SPRING").ordinal());

	}
}
