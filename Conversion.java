package core_programs;

public class Conversion {
	public static void main(String[] args) {
		int s =2000;
		double d = 4.967d;
		float f = 40.34f;
		int i = (int)d;//narrowing(explicit)
		long l = s;//widening(implicit)
		System.out.println(i);
		System.out.println(l);
	}

}
