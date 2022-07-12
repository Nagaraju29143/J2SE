package training.java.exception.unchecked;

public class ExceptionDemo {

	  public static void fun() 
	    { 
		  
	        moreFun(); 
		  
	    System.out.println("Method fun"); 
	    } 
	    public static void moreFun() 
	    { 
	    	int x=10/0;//Exception object created
	        System.out.println("ExceptionHandling::Normal Termination"); 
	    } 

	
	public static void main(String[] args) {
		//default exception handler throw exception details to console
		//exception name,exception description and stack trace
		
		  fun(); 
		
		  System.out.println("main method"); 
	}

}
