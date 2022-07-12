package training.java.exception.handling;

public class ExceptionHandlingDemo1 {

	public static void main(String[] args) {
		
       try{ 
            int a = 20/0; 
            System.out.println("Inside try block-1"); 
            System.out.println("Inside try block-2");
            
          }catch (ArithmeticException ex) {
		    System.out.println("Arithmetic Exception raised and caught");
		 }
		 
		
		System.out.println("rest of the logic");
		
		
	}

}
