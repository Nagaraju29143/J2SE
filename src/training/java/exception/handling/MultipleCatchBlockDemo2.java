package training.java.exception.handling;

public class MultipleCatchBlockDemo2 {

	public static void main(String[] args) {
		try{    
            int[] a=new int[5];    
            
            System.out.println(a[10]);  //AIOE
           }    
           catch(ArithmeticException e)  
              {  
               System.out.println("Arithmetic Exception occurs");  
              }    
              
           catch(Exception e)  
              {  
               System.out.println("Parent Exception occurs");  
              }  
		
           System.out.println("rest of the code");    

	}

}
