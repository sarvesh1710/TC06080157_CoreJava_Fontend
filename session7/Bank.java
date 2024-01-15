package com.acc;

public abstract class Bank {
	public abstract float getROI();
	
	public void deposit(){
		System.out.println("Money is deposited from account");
		
	}
	public void withdraw() {
		System.out.println("Money is Withrawed from account");
	}

}
