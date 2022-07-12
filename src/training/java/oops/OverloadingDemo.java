package training.java.oops;

import java.io.IOException;
import java.util.ArrayList;

class OverloadingDemo {
	
	String s="";	
	
	// Method with 2 parameter 
   public final int Multiply(int a, int b) throws RuntimeException
    { 
        return a * b; 
    } 
    
    // Method with the same name but 3 parameters 
  private   int Multiply(int a, int b, int c) throws NullPointerException
    { 
        return a * b * c; 
    } 
  
    // Method with the same name but 2 double parameters 
  protected   double Multiply(double a, double b)  throws IOException
    { 
        return a * b; 
    } 
   
    
  public static void main(String[] args) throws IOException 
    { 
    	OverloadingDemo s = new OverloadingDemo(); 
    	
    	ArrayList list=new ArrayList();
    	list.add(10);
    	
    	System.out.println(s.Multiply(2, 4));
    	System.out.println(s.Multiply(2, 7, 3)); 
        System.out.println(s.Multiply(5.5, 6.3)); 
        
    }
    
    //overloading main method
    public static void main(int[] args) {
    	
    	System.out.println("in overloaded main method");
    }

}
