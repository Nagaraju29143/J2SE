package training.java.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class SynchronizedCollectionDemo {

	public static void main(String[] args) {
		
		
		/*ArrayList al=new ArrayList();//al is default non synchronized & mutable
		 al.add(1);
		 al.add("rama");
		 al.add(null);
		 al.add(2);
		 al.add(1);
		 
		List list= Collections.synchronizedList(al);//al is synchronized & mutable
		list.add(10);
		System.out.println(list);
		
		List list1=Collections.unmodifiableList(list); //Immutable
		list1.add(20);
		
		System.out.println(list);*/
		
		
		Set s=new HashSet();//s is non synchronized
		s.add(1);
		s.add(2);
		s.add(null);
		s.add(2);
		s.add(null);
		System.out.println(s);
		
		Set s1= Collections.synchronizedSet(s);//s is synchronized
		s1.add(50);
		System.out.println(s1);
		
		Set s2=Collections.unmodifiableSet(s);
		s2.add(10);
		System.out.println(s2);
		
		/*Map map=new HashMap(); //map  is non synchronized
		map.put(10,"ten");
		map.put(20,"twenty");
		map.put(30,"thirty");
		map.put("fourty","fourty");
		
		map= Collections.synchronizedMap(map); //map  is  synchronized*/
		//System.out.println(map);
		
		
		
		 
	}

}
