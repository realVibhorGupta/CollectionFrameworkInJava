package collectionFramework;

import java.util.*;;

public class LinkedListDemo {

	@SuppressWarnings("rawtypes")
	public static void main (String args[])
	{
		LinkedList ll=new LinkedList<Comparable>();
		ll.add("vibhor");
		ll.add(23);
		ll.add("Software");
		ll.set(1,"gupta");
		ll.add(234);
		ll.addFirst("Sexy");
		ll.add(null);
		System.out.println(ll);
		ll.remove("Software");
		System.out.println(ll);
		
	}
	
}
