package training.java.exception.handling;

public class ExceptionHandlingDemo5 {

	public static void main(String[] args) {
		try 
        { 
            String str = "123"; 
            int num = Integer.parseInt(str); 
            System.out.println("Inside try block "+num); 
        }
		finally
        { 
            System.out.println("finally block executed"); 
        }
		
		System.out.println("rest of the logic");
	}

}
