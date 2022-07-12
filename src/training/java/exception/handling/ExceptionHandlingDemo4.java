package training.java.exception.handling;

public class ExceptionHandlingDemo4 {

	public static void main(String[] args) {
		try
        { 
            int a = 20/0; //exception raised
            System.out.println("Inside try block"); 
        }
		
		finally
        { 
            System.out.println("finally block executed"); 
        }
		
		System.out.println("rest of the logic");
	}

}
