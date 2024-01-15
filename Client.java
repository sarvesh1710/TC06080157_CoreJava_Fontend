package com.acc;

public class Client {
	public static void main(String[] args) {
		Bank b =new HdfcBank();
		
		b.getROI();
		b.deposit();
		b.withdraw();
		
		HdfcBank hb = new HdfcBank();
		System.out.println("HDFC manager salary is :" + hb.ManagerSalary(3000));
		
		Bank b1 = new IciciBank();
		b1.getROI();
		b1.deposit();
		b1.withdraw();
		
		IciciBank I = new IciciBank();
		System.out.println("Employee Bonus :"+I.EmployeeBonus(20000));
		
		
		
		
	}

}
