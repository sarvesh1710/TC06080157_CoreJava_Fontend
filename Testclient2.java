package core_programs;

public class Testclient2 {
	public static void main(String[] args){
		int a=90;//1011010
		int b=30;//0011110
		
		System.out.println(a&b);//0011010=26
		System.out.println(a|b);//1011110=94
		System.out.println(a^b);//1000100=68
		System.out.println(~a);//0100101=37
		System.out.println(a<<2);//1101000=104
		System.out.println(a>>2);//0010110=22
	}

}
