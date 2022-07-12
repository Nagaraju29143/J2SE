package training.java.collections;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {

		/*SortedMap smap = new TreeMap();

		smap.put(4, "four");
		smap.put(3, "three");
		smap.put(5, "five");
		smap.put(2, "two");
		//smap.put("one", "one");

		 System.out.println(smap);
		
		System.out.println(smap.descendingKeySet());
		System.out.println(smap.floorEntry("L"));
		System.out.println(smap.firstEntry());
		System.out.println( smap.descendingMap());*/

		NavigableMap<String, Integer> nm = new TreeMap<String, Integer>();

		nm.put("C", 888);
		nm.put("Y", 999);
		nm.put("A", 444);
		nm.put("T", 555);
		nm.put("B", 666);
		nm.put("A", 555);
		nm.put("R", 222);
		
		System.out.println( nm);
       
		//System.out.println( nm.lowerKey("R"));
		//System.out.println( nm.higherKey("R"));
		//System.out.println( nm.floorKey("R"));
		//System.out.println( nm.ceilingKey("R"));
		//System.out.println( nm.subMap("B","T"));
		/*System.out.println(nm.descendingKeySet());
		System.out.println(nm.floorEntry("Z"));
		System.out.println( nm.firstEntry());
		System.out.println( nm.lastKey());
		System.out.println(nm.firstKey());*/
		System.out.println( nm.descendingMap());
	}

}
