public class Stud {
	private int rollNo;
	private String name;
	private static int count;
	
	public Stud() {}
	
	public Stud(int rollNo,String name)
	{
		this.rollNo=rollNo;
		this.name=name;
		count++;
	}
	public static int getCount() {
		return count;
	}
	
	@Override
	public String toString() {
		return "Stud [rollNo=" + rollNo + ", name=" + name + "]";
	}
	
	static
	{
		System.out.println("static Block");
	}

	public static void main(String args[]) {
		System.out.println("Main Block");
		Stud s1=new Stud(1,"Sarvesh");
		Stud s2=new Stud(2,"Siddhesh");
		Stud s3=new Stud(3,"Ajay");
		System.out.println("Student Count="+Stud.getCount());
		//sysout(s1.getcount)

	}
}
