package training.java.exception.handling;

public class ExceptionHandlingDemo2 {

	public static void main(String[] args){
		try
        { 
            int a = 20/0; 
            System.out.println("Inside try block"+a); 
        }catch (NullPointerException   ex) { 
        	System.out.println("Exception caught in Catch block");
        } 
		finally
        { 
            System.out.println("finally block executed"); 
        } 
		  
		// rest of the program will not execute 
		System.out.println("rest of the logic");
	}

}
