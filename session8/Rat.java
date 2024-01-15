package com.acc1;

public class Rat implements Doable {

	@Override
	public void eat() {
		System.out.println("Rat  is eating");

	}

	@Override
	public void run() {
		System.out.println("Rat  is runing");

	}

	@Override
	public void sleep() {
		System.out.println("Rat  is sleeping");

	}

}
