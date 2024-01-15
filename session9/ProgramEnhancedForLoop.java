package core_programs;

public class ProgramEnhancedForLoop {
	public static void main(String[] args) {
		int  num1[] = {10,20,30,40,50};
		String str[] = new String[2];
	str[0]="My name is";
	str[1]="Sarvesh";
		for(int e:num1) {
			System.out.print(e+ " " );
}
		for(String a:str) {
			System.out.print(a+ " " );
		}
	}
}
