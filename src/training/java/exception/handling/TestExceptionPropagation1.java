package training.java.exception.handling;

class ExceptionTest{
	
	public static void fun() throws Exception
    { 
		System.out.println("from fun method"); 
        moreFun(); 
        System.out.println("after morefun method call"); 
    } 
    public static void moreFun() throws  Exception
    { 
    	System.out.println("from more fun method");
    		
    	int data=10/0;
    	
    	System.out.println(data);
    	
        System.out.println("rest of the logic"); 
    } 
}

public class TestExceptionPropagation1 {
	
	public static void main(String[] args) throws Exception{
		
		ExceptionTest.fun();
		
		System.out.println("rest of the logic"); 

	}

}
