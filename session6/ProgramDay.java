package core_programs;

import java.util.Scanner;

public class ProgramDay {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int Day;
	Day = sc.nextInt();
	switch(Day) {
		case 0:System.out.println("SUNDAY");
		break;
		case 1:System.out.println("MONDAY");
		break;
		case 2:System.out.println("TUESDAY");
		break;
		case 3:System.out.println("WEDNESDAY");
		break;
		case 4:System.out.println("THURESDAY");
		break;
		case 5:System.out.println("FRIDAY");
		break;
		case 6:System.out.println("SATURDAY");
		break;
		default:System.out.println("ENTER VALID INPUT");
}
}
}