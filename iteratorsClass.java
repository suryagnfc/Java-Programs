

/*
 * Java.util
 * An iterator is an object that enables to cycle through a collection, obtain or remove elements
 *Each of the collection classes provides an iterator() method that returns an iterator to the start of the collection.
 *
 *The Iterator class provides the following methods:
 *hasNext(): returns true if there is at least one more element; otherwise it returns false.
 *next(): returns the next object and advances the iterator.
 *remove(): removes the last object that was returned by next from the collection.
 *
 *.next() returns the first element in the list and then moves the iterator on the next element.
 *Each time you call it.next() the iterator moves to the next element to the list.
 *
 * 
 * 
 */
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class iteratorsClass {

	public static void main(String[] args) {
		
		LinkedList<String> animals = new LinkedList<String>();
		
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Fox");
		animals.add("");
		animals.add("");
		animals.add("rabit");
		
		Iterator<String> it = animals.iterator();
		String value = it.next();
		System.out.println(value);
		
		
	}

}
