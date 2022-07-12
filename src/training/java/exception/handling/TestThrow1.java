package training.java.exception.handling;

class AgeException extends RuntimeException{
	
	AgeException(String msg){
		super(msg);
	}
}


public class TestThrow1 {
	//calling part
	static void validate(int age){ 
		
	     if(age<18) {  
	      throw new AgeException("Age should not be less than 18yrs.");  
	     }
	     else { 
	      System.out.println("welcome to vote.");  
	     }
	 }
	
	
	//caller part
	public static void main(String args[]){ 
		    try {
	          validate(15);  
		   }catch(AgeException ex) {
			 System.out.println("exception handled");  
		  }
	     
		    System.out.println("rest of the code...");  
	  }  

}
