package package1;

import java.util.Stack;

public class Stack1 {
	public static void main(String[] args) {
		Stack s=new Stack();
		
		s.push(10);
		s.push(3);
		s.push("A");
		s.push('R');
		
		System.out.println(s);
		System.out.println(s.empty());
		System.out.println(s.peek());
		System.out.println(s.search('y'));
		System.out.println(s.search('R'));
		s.pop();
		System.out.println(s);
		
	}

}
