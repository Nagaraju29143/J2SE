
  package training.java.exception.handling;

import java.io.IOException;

public class TestExceptionPropagation3 {  
	  void m1() throws IOException{
		    throw new IOException("checked");//checked exception 
		   //throw new RuntimeException("unchecked"); //unchecked exception
		  } 
	  void m2() throws IOException{
		  m1();
		 }
	  void m3(){
		  try{ 
			  m2(); 
			  }catch(Exception e){System.out.println("exception handeled");
		    } 
	  } 
  public static void main(String args[]){ 
	  TestExceptionPropagation3 obj=new TestExceptionPropagation3(); 
	  obj.m3(); 
	  System.out.println("normal flow"); 
	  } 
  }
 