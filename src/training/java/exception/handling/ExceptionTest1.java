package training.java.exception.handling;

public class ExceptionTest1 {

	public static void main(String[] args)   {
		System.out.println("in main method");
		
		/*try {     
		int i=10/0; //ArithmeticException 
		}catch(ArithmeticException ex){
			ex.printStackTrace();
		}*/
		
		int i=10/0; 
		
		System.out.println("line12");
		System.out.println("line13");
		System.out.println("line14");
		System.out.println("line15");
		

	}

}
