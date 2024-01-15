package com.acc1;

public class EnumSwitchDemo {
	enum Day{SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURESDAY,FRIDAY,SATURDAY};
	public static void main(String[] args) {
		Day day = Day.FRIDAY;
		switch(day) {
		case SUNDAY:System.out.println("SUNDAY");
		break;
		case MONDAY:System.out.println("MONDAY");
		break;
		case TUESDAY:System.out.println("TUESDAY");
		break;
		case WEDNESDAY:System.out.println("WEDNESDAY");
		break;
		case THURESDAY:System.out.println("THURESDAY");
		break;
		case FRIDAY:System.out.println("FRIDAY");
		break;
		case SATURDAY:System.out.println("SATURDAY");
		break;
		default : System.out.println("Other Day.");

		}
	
	}

}
