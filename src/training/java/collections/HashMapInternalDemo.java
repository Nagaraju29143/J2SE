package training.java.collections;

import java.util.HashMap;
import java.util.Map;

class Employeee {
	String name;

	Employeee(String name) {
		this.name = name;
	}

	public boolean equals(Object obj) {
		Employeee emp = (Employeee) obj;

		return this.name.equals(emp.name);
	}

	public int hashCode() {
		int hash = (int) name.charAt(0);
		System.out.println("hashCode for key: " + name + " = " + hash);
		return hash;
	}

}

public class HashMapInternalDemo {

	public static void main(String[] args) {
		Map map = new HashMap<>();
		map.put(new Employeee("vishal"), 20);
		map.put(new Employeee("sachin"), 30);
		map.put(new Employeee("vaibhav"), 40);

		System.out.println(map);

		System.out.println("Value for key sachin: " + map.get(new Employeee("sachin")));
		System.out.println("Value for key vaibhav: " + map.get(new Employeee("vaibhav1")));
	}

}
