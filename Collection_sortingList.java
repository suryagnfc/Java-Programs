import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * You can call the sort() methods on different types of lists, such as integers.
 * Other useful methods in the Collections class:
 * max(Collection c): Returns the maximum element in c as determined by natural ordering
 * min(collection c): returns the min element in c
 * reverse(List list) : Reverse the sequence in list.
 * shuffle(List list): shuffles the elements in list.
 */

public class Collection_sortingList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<String> animals = new ArrayList<String>();
		animals.add("Cat");
		animals.add("Snake");
		animals.add("dog");
		animals.add("cat");
		System.out.println(animals);
		Collections.sort(animals);
		//There is another class Collection - without s, which doesnt have the sort function
		System.out.println(animals);
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(66);
		numbers.add(35);
		numbers.add(23);
		numbers.add(56);
		numbers.add(15);
		numbers.add(-15);
		numbers.add(345);
		System.out.println(numbers);
		System.out.println(Collections.max(numbers));
		System.out.println(Collections.min(numbers));

		Collections.sort(numbers);
		System.out.println(numbers);
		
		List<Integer> num = new ArrayList<Integer>();
		num.add(34);
		num.add(12);
		num.add(10);
		num.add(56);
		num.add(234);
		System.out.println("");;
		System.out.println("Before reverse");;
		System.out.println(num);
		System.out.println(numbers);
		System.out.println(animals);
		Collections.reverse(num);
		Collections.reverse(numbers);
		Collections.reverse(animals);
		System.out.println("After reverse");;
		System.out.println(num);
		System.out.println(numbers);
		System.out.println(animals);
	}

}
