package training.java.exception.handling.overriding;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

class ParentClass { 
	  
    void m1() throws Exception
    { 
        System.out.println("ParentClass:m1"); 
    }
    
    void m2() throws RuntimeException
    { 
        System.out.println("ParentClass:m2"); 
    }
    
    void m3() throws IOException,SQLException{
    	System.out.println("ParentClass:m3"); 
    }
    
}

public class ChildClass extends  ParentClass{
	
	// we can throw only either same exception or its child exceptions but not parent exceptions
	
     void m1() throws Exception
    { 
        System.out.println("ChildClass:m1"); 
    }
	
	
	void m2() throws NullPointerException { 
		  System.out.println("ChildClass:m2");
	  }
	
	// Not required to throw any exception while overriding method
	void m3() {
    	System.out.println("ChildClass:m3"); 
    }
    
	 

	public static void main(String[] args) throws Exception   {
		
		ParentClass p=new ChildClass();
		p.m1();
		p.m2();
		p.m3();

	}

}
