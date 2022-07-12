package training.java.exception.handling;

public class ExceptionHandlingDemo3 {

	public static void main(String[] args) {
		try 
        { 
            String str = "hello"; 
            int num = Integer.parseInt(str); 
            System.out.println("Inside try block"); 
        }catch(NumberFormatException ex) 
        { 
            System.out.println("catch block executed..."); 
        } 
		finally
        { 
            System.out.println("finally block executed"); 
        }
		
		System.out.println("rest of the logic");
	}

}
