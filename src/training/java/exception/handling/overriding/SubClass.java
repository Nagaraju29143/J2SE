package training.java.exception.handling.overriding;

class SuperClass { 
	  
    void method() 
    { 
        System.out.println("SuperClass"); 
    }
    
}

public class SubClass extends SuperClass{
	
	//we can not throw Checked Exception while overriding
   /* void method() throws IOException 
    { 
        System.out.println("SubClass"); 
    } */
	
	
	//we can throw only UnChecked Exceptions(RuntimeException and its Subclasses) while overriding
	void method() throws RuntimeException
    { 
        System.out.println("SubClass"); 
    } 

	public static void main(String[] args) {
		SuperClass s = new SubClass(); 
        s.method(); 
	}

}
