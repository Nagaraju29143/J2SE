package training.java.exception.handling;

public class TestExceptionPropagation2 {
	void m1(){  
	    int data=50/0;
	  }  
	  void m2(){  
	    m1();  
	  }  
	  void m3(){  
		   try{  
		    m2();  
		   }catch(Exception e){System.out.println("exception handled");}  
	  }  
	  
	  public static void main(String args[]){  
	   TestExceptionPropagation2 obj=new TestExceptionPropagation2();  
	   obj.m3();  
	   System.out.println("normal flow...");  
	  }  
}
