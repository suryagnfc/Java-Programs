/*
 * similar to ArrayList
 * we can change ArrayList to LinkedList by changing the object type.
 * Cannot specify the initial capacity for LinkedList like we can do for ArrayList.
 * 
 * Need to import java.util.LinkedList package
 */

import java.util.LinkedList;

public class linkedListClass {

	public static void main(String[] args) {
		LinkedList c = new LinkedList();
		c.add("Hello");
		c.add(10);
		c.add("Number 3");
		
		LinkedList<String> b= new LinkedList<String>();
		b.add("b1");
		b.add("Number 10");
		
		System.out.println(c);
		System.out.println(b);
		
		for(String s: b)
		{
			System.out.println(s);
		}
		
		for(int i =0; i<c.size();i++)
		{
			System.out.println(c.get(i));
		}
		
		System.out.println(c.get(0).getClass());
		System.out.println(c.get(1).getClass());
		System.out.println(c.get(2).getClass());
		System.out.println(b.get(0).getClass());
		System.out.println(b.get(1).getClass());
		

	}

}
