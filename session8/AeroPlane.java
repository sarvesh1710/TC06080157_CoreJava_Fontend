package com.acc1;

public class AeroPlane implements Flyable {

	@Override
	public void StartToFly() {
		System.out.println("AeroPlane Start To Fly");
	}

	@Override
	public void TakeATurn() {
		System.out.println("AeroPlane Take a Turn");
	}

	@Override
	public void StopToFly() {
		System.out.println("AeroPlane Stop To Fly");
	}

}
