package package1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		/*int no=10;
		Integer i=new Integer(no);//boxing-primitive to wrapper
		int a=i.intValue();//unboxing-wrappper to primitive
		int b=100;
		Integer m=b;//Auto-boxing
		int c=m;*///auto-unboxing
		
		List<Integer> l= new ArrayList<Integer>();
		l.add(10);
		l.add(28);
		l.add(86);
		l.add(48);
		System.out.println(l);
		l.add(2,56);
		System.out.println(l);
		l.remove(1);
		System.out.println(l.contains(19));
		List l1= Collections.synchronizedList(l);
		
		
		Iterator<Integer> i=l.iterator();
		while(i.hasNext()) {
			int n=i.next();
			if(n%2==0)
			{
				System.out.println(n);
			}
			else
			{
				i.remove();
//				i.add();
//				i.set();
//				i.replace();
			}
		}
	}
	
	
	

}
