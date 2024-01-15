public class Employee {
	private int empID;
	private String empName;
	private float empSal;
	
	public Employee() {
		System.out.println("Default Constructor Invoked");
	}
	
	public Employee(int empID , String empName , float empSal) {
		System.out.println("Parameterized Constructor Invoked");
		this.empID=empID;
		this.empName=empName;
		this.empSal=empSal;
	}
	public String toString() {
		return "Employee = ["+empID+" "+empName+" "+empSal+"]";
	}
	
	public static void main(String args[]) {
		Employee e=new Employee();
		System.out.println(e);
		Employee e1=new Employee(1,"Sarvesh",150000f);
		System.out.println(e1);


	}

}
