package com.acc1;

public class TestClient {

	public static void main(String[] args) {
		/*
		 * Doable d = new Cat(); d.eat(); d.run(); d.sleep(); d = new Rat(); d.eat();
		 * d.run(); d.sleep();
		 */
		Doable d;
		int k = 10;
		if(k<15) {
			d = new Cat();
		}
		else {
			d = new Rat();
		}
		d.eat(); d.run(); d.sleep();
	}
	

}
