package training.java.collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
		
		Emp e1=new Emp(10,"ram",100.15);
		
		Customer c1=new Customer(100,"sai",25);
		Customer c2=new Customer(200,"test",29);
		Customer c3=new Customer(200,"test",29);
		Customer c4=new Customer(200,"test",29);
		
 /*ArrayList Example*/
		List al=new ArrayList();
		
		
    //1.Adding objects		
	/*	al.add(20);
		al.add("rama");
		al.add(10.25);
		al.add(null);
		al.add(20);
		al.add(true);
		al.add(e1);
		al.add(e1);
	    al.add(c1);
	    al.add(c2);
	    al.add(30f);
	    al.add('J');*/
	    
	    
	    /* //2.Counting objects		
	     System.out.println("Size: "+al.size());
	   System.out.println(al);
	    
	    //3.Searching objects
	    System.out.println(al.contains(20));
	    System.out.println(al.contains("rama")?"available":"not available"); 
	    
	     //4.Retrieving objects	    
	    System.out.println(al.get(4)); 
	    
	    //5.Removing objects 
	    al.remove(5);
	    al.remove(e1);
	    System.out.println("Size: "+al.size()+"--"+al); 
	    
	     //6.Replacing objects    
	    al.set(2, 50.50);   
	    System.out.println("Size: "+al.size()+"--"+al); 
	    
	      //7.Inserting objects    
	    al.add(2, "krishna");
	    System.out.println("Size: "+al.size()+"--"+al); */
	    
	   
	    
	//Other operations
	     /*System.out.println(al);
	     System.out.println(al.isEmpty());
	       
	     
	       
	       List al1=new ArrayList();
	      System.out.println(al.equals(al1));
	     
	        List list=al.subList(3, 7);
		   System.out.println("Size: "+list.size()+"--"+list);
		   
		   Object[] oa=al.toArray();
	       System.out.println(oa);
		 
	      System.out.println(al.indexOf(e1));
	      System.out.println(al.lastIndexOf(e1));

	    
	         al.clear();
		  System.out.println("Size: "+al.size()+"--"+al);*/
	    
	    
		
		 
		/*Collection collection=new ArrayList();
		 collection.add(e1);
		 collection.add(c1);
		 collection.add(10);
		 collection.add(10.25);
		 collection.add(35f);
		
		 List al1=new ArrayList();
		 al1.add("ram");
		 al1.add('J');
		 
		 al1.addAll(collection);
		 
		 System.out.println("Size: "+al1.size()+"--"+al1);
			
		 al1.removeAll(collection);
		 System.out.println("Size: "+al1.size()+"--"+al1);
		  al1.retainAll(collection);
		 System.out.println("Size: "+al1.size()+"--"+al1);*/
			
	    
		 
	    
/*LinkedList Example*/
	   /* LinkedList ll=new LinkedList();
		 
		
		    ll.add(20);
		    ll.add("rama");
		    ll.add(10.25);
		    ll.add(null);
		    ll.add(20);
		    ll.add(true);
		    ll.add(e1);
		    ll.add(c1);
		    
		    System.out.println("Size: "+ll.size()+"--"+ll); 
		
		     System.out.println(ll.contains(10.50)?"available":"not available"); 
	    
		      System.out.println(ll.get(6)); 
	    
		       ll.remove(5);
	    System.out.println("Size: "+ll.size()+"--"+ll); 
	    
	    ll.set(2, 50.50);   
	    System.out.println("Size: "+ll.size()+"--"+ll); 
	    
	    ll.add(2, "krishna");
	    System.out.println("Size: "+ll.size()+"--"+ll);*/
	    
	    
		
/*Vector Example*/
		 /*Vector vector=new Vector();
		
		vector.add(1);
		vector.addElement("rama");
		vector.add(null);
		vector.add(2);
		vector.add(1);
		vector.add(1, "krishna");	
		 
		 System.out.println(vector);
		 
		System.out.println("size: "+vector.size());
		System.out.println(vector.contains("rama")?"rama exists":"rama not exists");
		System.out.println("element at index 2: "+vector.get(2));
		System.out.println("index of krishna is: "+vector.indexOf("krishna"));
		System.out.println("is collection empty?:"+vector.isEmpty());
		System.out.println("String equivllent of collection: " + vector.toString());
		System.out.println(vector.remove("rama"));
		System.out.println("after removed rama:"+vector);
		vector.clear();
		System.out.println(vector);*/
		
		
		
/*Stack example*/
		
		/*Stack stack=new Stack();
	
		stack.push(10);
		stack.push("rama");
		stack.push(null);
		stack.push(10);
		stack.push(50);
		
		System.out.println(stack);
		
		//peek operation
		System.out.println(stack.peek()); //Returns the element on the top from stack, but does not remove it.
		System.out.println("after peek operation stack: "+stack);//
		
		//pop operation
		System.out.println(stack.pop()); //returns and removes  the top element from the stack.  
		System.out.println("after pop operation stack: "+stack);
		
		//search operation
		int i=stack.search("rama1");
		if(i>0){
			System.out.println("Element found");
		}else {
			System.out.println("Element not found");
		}*/
		
		
/*HashSet Example*/

		/*Customer c1=new Customer(100,"sai",25);
		Customer c2=new Customer(200,"test",29);
		Customer c3=new Customer(200,"test",29);
		Customer c4=new Customer(200,"test",29);*/
		
		HashSet hs=new HashSet();
		
		
		hs.add(10);
		hs.add(20);
		hs.add("test");
		hs.add(10.25);
		hs.add(null);
		hs.add(20);
		hs.add("rama");
		/*hs.add(c1);
		hs.add(c2);
		hs.add(c3);
		hs.add(c4);*/
		
		
		 
		//System.out.println("Size: "+hs.size()+"--"+hs);

		/*Iterator itr=hs.iterator();
	       
	    while(itr.hasNext()){
	       //We can perform read and remove only.	
	       Object obj=itr.next();
	       System.out.println(obj);
	       
	    }*/
		
		
/*PriorityQueue Example*/
	    
		
		/* Queue pq=new PriorityQueue();
		
		pq.add("Ram");
		pq.add("Test");
		pq.offer("Vasu");
		pq.add("Nag");
		pq.offer("Test");
		//pq.add(10);
		//pq.add(null);
		System.out.println("Queue: "+pq);
		
	    // Printing the most priority element 
		  System.out.println("Head of the queue is: "+ pq.peek()); //returns element from queue//returns null on empty queue
	     // System.out.println("Head of the queue is: "+ pq.element());//throws exception on empty queue
     
        // Removing the top priority element (or head) 
	       System.out.println("retrieved and removed from head of the queue: "+pq.poll()); // returns and removes element from queue
        System.out.println("Queue After poll operation: "+pq);
        
        pq.remove("Vasu");
        System.out.println(pq);
        
        if(pq.contains("Ram")){
        	System.out.println("Element found ");
		}else {
			System.out.println("Element not found");
		}*/
        
      // Printing all elements 
       /*  System.out.println("The queue elements:"); 
        Iterator itr = pq.iterator(); 
        while (itr.hasNext()) { 
            System.out.println(itr.next()); 
            }*/
        
/*ArrayDeque example*/
       Deque<String> dq= new ArrayDeque<String>();
        dq.add("Ram");
        dq.add("Krishna");
        dq.add("Vasu");
        dq.add("Nag");
       //dq.add(null);
        System.out.println(dq);  
        
        dq.addFirst("Hari");
        dq.addLast("Sai");
        System.out.println(dq);
        
        System.out.println("Head value using peek:"+ dq.peek());
        System.out.println(dq);
         System.out.println("element returned and removed from queue: "+dq.poll());
        System.out.println(dq);
        
        dq.push("test");
        System.out.println(dq);
	}

}
