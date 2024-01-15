package TNS;

import java.util.Scanner;

public class Pattern1 {
	public static void main(String args[]) {
		int i=0,val,j;
		Scanner sc=new Scanner(System.in);
		val=sc.nextInt();
		for(i=0;i<val;i++) {
			for(j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.print("*");
		
		}
		
	}

}
