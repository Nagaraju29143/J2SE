package training.java.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class CursorsDemo {

	public static void main(String[] args) {
		
		Emp e1=new Emp(10,"ram",100.15);
		Customer c1=new Customer(100,"sai",25);
		Customer c2=new Customer(200,"test",25);
		Customer c3=new Customer(300,"test123",25);
		
		Vector v=new Vector();
		 v.add(10);
		 v.add("rama");
		 v.add(10.25);
		 v.add(10);
		 v.add(c1);
		 
		 
	//Enumeration example
		 
		 /*Enumeration e=v.elements();
		 
		 while(e.hasMoreElements()){
			   Object obj=e.nextElement();
			  
			   System.out.println(obj);}
				
				//we can perform only read
				 if(obj.equals("rama")) {
			    	   e.remove(); 
			       }
			       if(obj.equals(10)) {
			    	   e.set(20); 
			       }
			       if(obj.equals(c1)) {
			    	   e.add(e1); 
			       }
			}*/
		 
		
		
		
		
	 // Iterator example
		 
	/*List al = new ArrayList();
			
			al.add(10);
			al.add("rama");
			al.add(10.25);
			al.add(10);
			al.add(c1);	
			
			 System.out.println("Original List= "+al);		
       
		Iterator itr=al.iterator();
       
	    while(itr.hasNext()){
	       //We can perform read and remove only.	
	       Object obj=itr.next();
	       
	       System.out.println(obj);
	       
	         
	      if(obj.equals(c1)) {
	    	   itr.remove(); 
	       }
	       
	       
	       if(obj.equals(10)) {
	    	   itr.set(20); 
	       }
	       if(obj.equals(c1)) {
	    	   itr.add(e1); 
	       }
	    }
	    
	    System.out.println("Updated List= "+al);*/
	//ListIterator example
		 
		 /*List al = new ArrayList();
			
			al.add(10);
			al.add("rama");
			al.add(10.25);
			al.add(10);
			al.add(c1);	
			
		System.out.println("Original List= "+al);	
			
	    ListIterator litr=al.listIterator();
	    System.out.println("forward direction display:");
	    
	    while(litr.hasNext()){
	         Object obj=litr.next();
	         System.out.println(obj); 
	       //we can perform read,remove,replace and add
	        if(obj.equals(c1)) {
	        	 litr.remove(); 
		       }
		       if(obj.equals(10)) {
		    	  litr.set(70); 
		       }
		       if(obj.equals(10.25)) {
		    	  litr.add(e1); 
		       }
		           
	    }
	    System.out.println("Updated List= "+al);  //[70,rama,10.25,70,e1]
	    
	    System.out.println("backward direction diplay");
	    while(litr.hasPrevious()){
	    	Object obj=litr.previous();
	        System.out.println(obj); 
	    }*/
		
  //for-each example
		 System.out.println("enhanced for loop example");
	     List al = new ArrayList<>();
			
			al.add(10);
			al.add("rama");
			al.add(10.25);
			al.add(10);
			al.add(c1);	
			al.add(c2);
			al.add(c3);
		
		for(Object obj:al) {
			System.out.println(obj);
		
			//al.remove(obj);
		 }
		
		
		
		//using java1.8
		
		/*al.forEach(i->System.out.println(i));*/
		
	}
}
