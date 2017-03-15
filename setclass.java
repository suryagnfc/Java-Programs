/*
 * A set is a collection that cannot contain duplicate elements. It models the mathematical set abstraction.
 * One of the implementation of the Set is the HashSet class.
 * 
 * 
 * The HashSet clas does not automatically retain the order of the elements as they are added.
 * To order the elements, use a LinkedHashSet, which maintains a linked list of set's elements in the order in which they were inserted.
 * 
 */
import java.util.HashSet;
public class setclass {

	public static void main(String[] args) {
	
		HashSet<String> set = new HashSet<>();
		//or HashSet<String> set = new HashSet<>(); -- same declaration as above.
		set.add("A");
		set.add("B");
		set.add("C");
		System.out.println(set);
		set.add("C"); 
		System.out.println(set); //same output as above
		System.out.println(set.size()); //same output as above
		
		HashSet set2 = new HashSet();
		//no specific type of values to be added. String, int, double etc can be added
		set2.add("a");
		set2.add(1);
		set2.add(2);
		System.out.println(set2);
		
		HashSet set3 = new HashSet<>();
		//same as above.. <> doesnt change anything
		set3.add("a");
		set3.add(1);
		set3.add(2);
		System.out.println(set3);
	}

}
