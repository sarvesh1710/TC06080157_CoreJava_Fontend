package com.acc1;

public class TestClient1 {

	public static void main(String[] args) {
		Flyable f = null;
		int k = 20;
		if(k<20) {
			f = new Bird();
		}
		else if(k<20) {
			f = new Kite();
		}
		else if(k==20) {
			f = new AeroPlane();
		}
		f.StartToFly();
		f.TakeATurn();
		f.StopToFly();

	}

}
