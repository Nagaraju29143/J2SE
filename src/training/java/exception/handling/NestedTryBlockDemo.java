package training.java.exception.handling;

public class NestedTryBlockDemo {

	public static void main(String[] args) {
		try{ 
			System.out.println("main try block");
			
			int x=10/5;
			System.out.println("x: "+x);  
			    try{  
			     System.out.println("inner try block-1");  
			     int b =39/0;  
			    }catch(ArithmeticException e){
			    	e.printStackTrace();
			    	}  
		   
			    try{  
			    	System.out.println("inner try block-2");  
			    int a[]=new int[5];  
			    a[7]=4;  
			    }catch(ArrayIndexOutOfBoundsException e){
			    	e.printStackTrace();
			    	}  
		     
		    System.out.println("rest of the code"); 
		    
		  }catch(Exception ex){
			  System.out.println("outer catch block:exception handled");
			  }  
		  
		  System.out.println("rest of code..");  
	}  

	

}
