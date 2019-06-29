package collectionFramework;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet s=new TreeSet();
		s.add("A");
		s.add("Z");
		s.add("a");
		s.add("VIBHOR");//default natural sorting order
		s.add("B");
		s.add("C");
		s.add("D");
		try
		{
			s.add(null);
		}catch(NullPointerException npe )
		{
			npe.printStackTrace();
		}
		s.add("l");
		System.out.println(s);
		
		
		
		
		
	}

}
