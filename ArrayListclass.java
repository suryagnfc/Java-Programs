/*
 * JAVA API
 * ArrayList is one such class (Java api).
 * ArrayLists are created with an initial size , but when the size is exceeded,
 * the collection is automatically enlarged.
 * When the objects are removed, the ArrayList may shrink in size.
 * 
 * ArrayList class is in Java.util package so it should be imported.
 * 
 * ArrayList stores Objects. hence we cannot pass int, but instead it should be passed as Integer
 * or Double, String.
 * 
 * ArrayList class provides a number of useful methods for manipulating its objects.
 * add() method adds new objects to the ArrayList.
 * remove() methods remove objectsfrom the ArrayList.
 * contains() true if list contains the element
 * get(int index) returns the element at specified position
 * size() returns the number of elements in list
 * clear() removes all of the elements from the list.
 */

import java.awt.Window.Type;
import java.util.ArrayList;
public class ArrayListclass {

	public static void main(String[] args) {
		ArrayList colors = new ArrayList();
		//with optionally capacity and type
		ArrayList<String> color = new ArrayList<String>(10);
		
		colors.add("Red");
		colors.add(10);
		colors.add(11);
		colors.add("Orange");
		
		color.add("Red");
		color.add("10");
		color.add("Orange");
		
		System.out.println(colors);
		System.out.println("");
		System.out.println(color);
		System.out.println(colors.get(0).getClass());
		System.out.println(colors.get(1).getClass());
		System.out.println(colors.get(2).getClass());
		System.out.println(colors.get(3).getClass());
		System.out.println(color.get(1).getClass());
		
	}

}
