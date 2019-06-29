package collectionFramework;

import java.util.TreeSet;

public class TreeSetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet t=new TreeSet();
		
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("A"));
		System.out.println(t);// class cast exception
		
	}

}
