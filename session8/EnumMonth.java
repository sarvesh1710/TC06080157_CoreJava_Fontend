package com.acc1;

import com.acc1.EnumSwitchDemo.Day;

public class EnumMonth {
	enum Month{JANUARY,FEBRUARY,MARCH,APRIL,MAY,JUNE,JULY,AUGUST,SEPTEMBER,OCTOBER,NOVEMBER,DECEMBER};
	public static void main(String[] args) {
		Month month = Month.APRIL;
		switch(month) {
		case JANUARY:System.out.println("JANUARY");
		break;
		case FEBRUARY:System.out.println("FEBRUARY");
		break;
		case MARCH:System.out.println("MARCH");
		break;
		case APRIL:System.out.println("APRIL");
		break;
		case MAY:System.out.println("MAY");
		break;
		case JUNE:System.out.println("JUNE");
		break;
		case JULY:System.out.println("JULY");
		break;
		case AUGUST:System.out.println("AUGUST");
		break;
		case SEPTEMBER:System.out.println("SEPTEMBER");
		break;
		case OCTOBER:System.out.println("OCTOBER");
		break;
		case NOVEMBER:System.out.println("NOVEMBER");
		break;
		case DECEMBER:System.out.println("DECEMBER");
		break;
		default : System.out.println("Other Day.");

}
}
}