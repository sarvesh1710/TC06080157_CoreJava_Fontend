import java.io.FileOutputStream;

public class Demo2 {

	public static void main(String[] args) {
		FileOutputStream fos=null;
		try {
			System.out.println("In try");
			fos=new FileOutputStream("d://mno.txt",true);//true is for making changes in same file
			String str="Jspm Engneering college";
			byte b[]=str.getBytes();
			fos.write(b);
		}catch(Exception e) {
			System.out.println("In Catch");
			System.out.println(e);
		}
		finally {
			System.out.println("In finallly");
			fos.close()
		}
		
	}

}
