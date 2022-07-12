package training.java.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) {
		//Map<Integer,String> map=new HashMap<>(); //fail fast
		
		Map<Integer,String> map=new ConcurrentHashMap<>(); //fail safe
		map.put(1, "one");
		map.put(2, "two");
		map.put(4, "four");
		map.put(3, "three");
		
		for(Map.Entry<Integer,String> i:map.entrySet())	{
        	if(i.getKey().equals(2)) {
        		map.remove(2);
        	}
        }
		
		System.out.println(map);
	}

}
