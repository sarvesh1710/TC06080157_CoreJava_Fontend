package TNS;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String args[]) {
		int val;
		boolean flag=true;
		Scanner sc=new Scanner(System.in);
		val=sc.nextInt();
		for(int i=2;i<(val/2);i++) {
			if(val%i==0) {
				flag=false;
				break;
			}
			else {
				flag=true;
			}
		}
		if(flag==true) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("No a Prime Number");

		}
		
	}
		
	}
