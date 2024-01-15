package com.acc;

public class IciciBank extends Bank{
	public float getROI(){
		System.out.println("ROI of The ICICI Bank is 12%");
		return 0;
	}
	
	public float EmployeeBonus(float Salary){
		float Bonus = Salary*4/5;
		return Bonus;
	}

}
