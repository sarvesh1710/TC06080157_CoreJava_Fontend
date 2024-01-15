package TNS;

import java.util.Scanner;

public class Loop3 {
	public static void main(String args[]) {
		int i=1,fact=1;
		Scanner sc=new Scanner(System.in);
		int val = sc.nextInt();
		do {
			fact=fact*i;
			i++;
		}while(i<=val);
		System.out.println(fact);

	}
}
