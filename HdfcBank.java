package com.acc;

public  class HdfcBank extends Bank {
	
	public float getROI(){
		System.out.println("ROI of The HDFC Bank is 10%");
		return 0;
	}
	
	public float ManagerSalary(float perdaypay){
		float salary = perdaypay*30;
		return salary;
	}

	}

