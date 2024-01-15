package core_programs;

public class GrabageCollection {
	protected void finalize()throws Throwable{ 
		System.out.println("garbage Collectio Performed");
	}
	
	public static void main(String[] args) {
		GrabageCollection G = new GrabageCollection();
		G = null;
		
		GrabageCollection a = new GrabageCollection();
		GrabageCollection b = new GrabageCollection();
		b=a;
		System.gc();
	}
}
