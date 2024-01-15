package package1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		FileOutputStream fos=new FileOutputStream("d://abc.txt");
//		ObjectOutputStream oos=new ObjectOutputStream(fos);
//		Student1 s=new Student1(1,"Sarvesh",1000.0f);
//		
//		oos.writeObject(s);
//		System.out.println("Success");
//		
//		oos.close();
//		fos.close();
		
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C://Users//sarve//OneDrive//Documents//Example"));
		Student1 s= (Student1)ois.readObject();
		System.out.println(s);
		
	}

}
