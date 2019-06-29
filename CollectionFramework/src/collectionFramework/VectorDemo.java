package collectionFramework;

import java.util.*;

public class VectorDemo {//it is synchronized and thread-Safe

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Vector v= new Vector(10,5);
	
	v.addElement("vibhor");
	
	for(int i=1;i<10;i++)
	{
	v.addElement(i);
	}
	System.out.println (v);
	Enumeration e=v.elements();
	while(e.hasMoreElements())
	/*{
		Integer I=(Integer)e.nextElement();
		if((I%2)==0)
			
		{
			System.out.println(I);
		}
	}
	*/

	//boolean c=v.isEmpty();
	//System.out.println(c);
	
	for(int i=1;i<5;i++)
	{
	v.addElement(i);
	}
	int capacity=v.capacity();
	System.out.println(capacity);
	System.out.println(v);//2*cc
	
	}
}
