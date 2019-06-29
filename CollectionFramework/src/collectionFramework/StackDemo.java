package collectionFramework;

import java.util.Enumeration;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			Stack s=new Stack();
			
			for(int i=1;i<=15;i++)
			{
			
			System.out.println(s.push(i));
			}
			s.empty();
			s.peek();
			int offset=s.search("3");
			System.out.println(offset);
			System.out.println(s.search(3));
			s.pop();
			System.out.println(s);
			s.pop();
			System.out.println(s);
			s.pop();
			System.out.println(s);
			s.pop();
		
			
			
			
			
			
			
	}

}
