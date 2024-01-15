package TNS;

import java.util.Scanner;

class Loops {
	public static void main(String asgs[])
	{
		int i,value,fact = 1;
		Scanner sc=new Scanner(System.in);
		value=sc.nextInt();
		for(i=value;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
		
	}
	
}
