package training.java.collections;

import java.util.TreeSet;


/*class MyComparator implements Comparator<Customer>{

	@Override
	public int compare(Customer c1, Customer c2) {
		
		Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2;
		 
		String  s1=obj1.toString();
		String s2=obj2.toString();
		
		Customer  c1=(Customer)obj1;
		Customer  c2=(Customer)obj2;
		
		return c1.getCustId()-c2.getCustId();
		
	}
	
}*/


public class TreeSetDemo {
	
	

	public static void main(String[] args) {
		
       //TreeSet ts=new TreeSet(new MyComparator());
		TreeSet ts=new TreeSet();
		
        /*ts.add(100);
		ts.add(103);
		//ts.add(null);
		ts.add(102);
		ts.add(103);
		ts.add(101);
		
		System.out.println(ts);*/
		
	    
		/*ts.add("ram"); 
        ts.add("test");     //compare(test,ram)
        ts.add("hari"); 
        ts.add("sai"); 
        ts.add("nag");
        ts.add("ram");
        System.out.println(ts);*/
      
        ts.add(new StringBuffer("ram")); 
        ts.add(new StringBuffer("test")); 
        ts.add(new StringBuffer("hari")); 
        ts.add(new StringBuffer("sai")); 
        ts.add(new StringBuffer("nag")); 
        ts.add(new StringBuffer("ram"));
        System.out.println(ts);
       
       /*Customer c1=new Customer(100,"sai",25);
	   Customer c2=new Customer(200,"test",30);
	   Customer c3=new Customer(300,"hari",29);
	   Customer c4=new Customer(400,"ram",26);
		
	   
       ts.add(c2);
       ts.add(c1);
       ts.add(c4);
       ts.add(c3);
		
		System.out.println(ts);*/
		
		/*List<Customer> list=new ArrayList<>();
		
		Customer c1=new Customer(100,"sai",25);
		Customer c2=new Customer(200,"test",30);
		Customer c3=new Customer(300,"hari",29);
		Customer c4=new Customer(400,"ram",26);
		
		   list.add(c2);
		   list.add(c1);
		   list.add(c4);
		   list.add(c3);
		   System.out.println("Before Sorting: "+list);
		   Collections.sort(list, new Customer());
		   System.out.println("After sorting: "+list);*/
		   
		  // Collections.sort(list, Customer.idComparator);
		  // Collections.sort(list, Customer.nameComparator);*/
		  // Collections.sort(list, Customer.ageComparator);
		   
		  // System.out.println(list)
	}

}
