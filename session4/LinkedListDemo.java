package package1;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.RandomAccess;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> l=new LinkedList<String>();
		l.add("Sarvesh");
		l.add("Rohit");
		l.add("Vrushali");
		l.add("Arya");
		
		System.out.println(l);
		
		
//		while(itr.hasNext())
//		{
//			String str=itr.next();
//			
//			if(str.equals("Rohit"))
//			{
//				itr.set("Priyanka");
//			}
//			if(str.equals("Arya"))
//			{
//				itr.add("Kiran");
//			}
//			System.out.println(l);
//		}
		ListIterator<String> itr= l.listIterator();
		while(itr.hasPrevious())
		{
			String str=itr.previous();
			
			if(str.equals("Rohit"))
			{
				itr.set("Sahjsh");
			}
			if(str.equals("Arya"))
			{
				itr.add("sdjsd");
			}
			System.out.println(str);
		}
		
//		l.set(0,"Rahul");
//		System.out.println(l);
//		
		
//		l.removeLast();
//		System.out.println(l);
//		
//		l.remove();
//		System.out.println(l);
//		
//		l.addFirst(40);
//		System.out.println(l);
//		
//		System.out.println(l instanceof Serializable);
//		System.out.println(l instanceof Cloneable);
//		System.out.println(l instanceof RandomAccess);
		

	}

}
