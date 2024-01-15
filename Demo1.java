package TNS;

import java.util.Scanner;

public class Demo1
{	
	public static void main(String args[])
	{
//		int id;
//		String name;
//		float marks;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter id:-");
//		id=sc.nextInt();
//		System.out.println("Enter name:-");
//		name=sc.next();
//		System.out.println("Enter marks:-");
//		marks=sc.nextFloat();
//		System.out.println("Enter character:-");
//		char ch = sc.next().charAt(2);
//		System.out.println("Entered character:-"+ch);
		int phy,chem,maths,bio,per;
		Scanner sc=new Scanner(System.in);
		System.out.println("physics");
		phy=sc.nextInt();
		System.out.println("chemistry");
		chem=sc.nextInt();
		System.out.println("maths");
		maths=sc.nextInt();
		System.out.println("bio");
		bio=sc.nextInt();
		per=(phy+chem+maths+bio)*100/400;
		System.out.println("Percentage:"+per);
		if(per>=35) {
			System.out.println("Pass");

		}
		else {
			System.out.println("Fail");

		}



		
				
	}
}
