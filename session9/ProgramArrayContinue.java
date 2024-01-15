package core_programs;

public class ProgramArrayContinue {
	public static void main(String[] args) {
		int  num[] = {10,20,30,40,50};
		for(int i=0;i<num.length;i++) {
			if(i==3) {
				continue;
			}
			System.out.println("number["+i+"] :" + num[i]);
		}
	}
}
