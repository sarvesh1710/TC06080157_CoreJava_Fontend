package com.acc1;

public class Bird implements Flyable {

	@Override
	public void StartToFly() {
		System.out.println("Bird Start To Fly");

	}

	@Override
	public void TakeATurn() {
		System.out.println("Bird Take a Turn");

	}

	@Override
	public void StopToFly() {
		System.out.println("Bird Stop To Fly");
	}

}
