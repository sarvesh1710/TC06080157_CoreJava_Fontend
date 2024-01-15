package com.acc1;

public class Kite implements Flyable {

	@Override
	public void StartToFly() {
		System.out.println("Kite Start To Fly");

	}

	@Override
	public void TakeATurn() {
		System.out.println("Kite Take a Turn");
	}

	@Override
	public void StopToFly() {
		System.out.println("Kite Stop To Fly");
}

}
