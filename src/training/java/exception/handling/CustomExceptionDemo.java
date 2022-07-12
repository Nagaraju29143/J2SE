package training.java.exception.handling;
//calling part
class UserIdNotFounfException extends RuntimeException{
	
	
	public UserIdNotFounfException(String msg){
		super(msg); //java.lang.RuntimeException constructor will be called 
	 }
	 
	 
	
	 public UserIdNotFounfException(String msg,Throwable cause){ 
		  super(msg,cause); 
		  }
	 
	
}

public class CustomExceptionDemo {
    //caller part
	public static void main(String[] args) {
		
		String userId=null;//select userId from user where userId='100'
		
		/*if(userId==null) {
			  throw new UserIdNotFounfException("userid not found in DB");
		 }*/
		
		 try {
		 System.out.println(userId.length());
		 }catch(Exception ex){
			 // throw new UserIdNotFounfException("userid not found in DB");
			throw new UserIdNotFounfException("userid not found",ex);
		 }
		
		 
		System.out.println("rest of the code");
		
		}
	}


