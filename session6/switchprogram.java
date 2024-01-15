package core_programs;

public class switchprogram {
	public static void main(String[] args) {
		char grade = '1';
		switch(grade) {
		case 'A':System.out.println("Exellent");
				break;
		case 'B':
		case 'C':System.out.println("Well Done!");
				break;
		case 'D':System.out.println("You Passed!");
		break;
		case 'E':System.out.println("Better Luck Nect time!");
		break;
		default:
			System.out.println("Please Enter valid Grade!!");
		}
	}
}
