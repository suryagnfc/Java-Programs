

/*
 * hashmap is used for storing data collection as key and value pairs.
 * One object is used as a key (index) to another object (the value).
 * 
 * The put, remove and get methods are used to add, delete, and access valuse in the HashMap.
 * containsKey  and containsValue methods that determine the presence of a specified key or value
 * if you try to get a value that is not present in your map, it returns the value of null. 
 */

import java.util.HashMap;

public class HashMapclass {

	public static void main(String[] args) {
		HashMap<String, Integer> points = new HashMap<String,Integer>();
		//this hashmap will take only string as keys and integer as values
		points.put("Amy", 15);
		points.put("Dave", 4);
		points.put("Rob", 154);
		System.out.println(points);
		System.out.println(points.get("Dave"));
		points.put("Dave", 34); // changes value for Dave
		System.out.println(points.get("Dave"));
		
		
		HashMap poi = new HashMap();
		//this hashmap will take any class(string, integer...) as key and any class as value
		poi.put(2, 23);
		poi.put(0, 233);
		poi.put(1, 32);
		poi.put("index1", 23);
		poi.put("index2 key", "index2 value");
		poi.put(3.4, 4.5);
		System.out.println(poi);
		System.out.println(poi.get("index2 key"));
		System.out.println(poi.get(3.4));
		
	}

}
