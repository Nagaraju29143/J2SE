package training.java.collections;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {

	public static void main(String[] args) {
		//List<String> originallist = new ArrayList<>(); //fail fast
		
	   List<String> originallist=new CopyOnWriteArrayList<>(); //fail safe
		
		originallist.add("Ram");
		originallist.add("Krishna");
		originallist.add("Vasu");
		originallist.add("Nag");
		
		
		for(String str:originallist) {
			 if(str.equals("Krishna")) {
				 originallist.remove(str);
			 }
		}
		
       /* Iterator<String> itr=originallist.iterator();
	    while(itr.hasNext()){
	       if(itr.next().equals("Krishna")) {
	    	  // itr.remove();
	    	   originallist.remove("Krishna");
	       }
	    }	*/
	    
	    System.out.println(originallist);
	}

}
