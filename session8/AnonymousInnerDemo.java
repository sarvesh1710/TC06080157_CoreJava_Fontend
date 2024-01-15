package com.acc1;
interface Double{
	void run();
}
abstract class Human{
	abstract void speak();
}
public class AnonymousInnerDemo {
	public static void main(String[] args) {
		Double d = new Double() {public void run(){System.out.println("Human is running");}};
		d.run();
		Human h = new Human() {public void speak(){System.out.println("Human is speaking");}};
		h.speak();

	}

}
