package core_programs;

public class ProgramFaculty {
	public static void main(String[] args) {
		Faculty[] f1 = new Faculty[5];
		f1[0] = new Faculty(1,"Physics","Pune","Vivek");
		f1[1] = new Faculty(2,"Chemistry","Mumbai","Sarvesh");
		f1[2] = new Faculty(3,"Maths","Pune","Ajay");
		f1[3] = new Faculty(4,"Electronics","Mumbai","Vijay");
		f1[4] = new Faculty(5,"Biology","Pune","Shubham");

		for(Faculty x:f1) {
			System.out.println(x);
		}

}
}
