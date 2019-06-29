package collectionFramework;

	import java.util.*;
	public class ArrayListDemo {

		@SuppressWarnings("unchecked")
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			@SuppressWarnings("rawtypes")
			ArrayList al=new ArrayList();
			al.ensureCapacity(10);
			
			al.add("A");
			al.add("B");
			al.add("c");//random acces applied to arraylist
			al.add("d");
			al.add("e");
			al.add("f");
			al.add("g");
			al.add("B");
			al.add("g");
			al.add("B");
			al.add("Bg");
			al.add("B");
			al.add("sd");
			al.add("B");
			al.add("ds");
			al.add("B");
			al.add("B");
			al.add(null);
			System.out.println(al);
			al.remove("A");
			System.out.println(al);
			al.add("A");
			System.out.println(al);
			al.add(0, "A");
			System.out.println(al);
			al.add(4,"23");
			System.out.println(al);
			boolean b=al.isEmpty();
			System.out.println(b);
			int i=al.size();
			System.out.println(i);
		System.out.println(al.size());
				}

	
		}
