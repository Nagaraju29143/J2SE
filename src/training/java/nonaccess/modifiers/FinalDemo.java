package training.java.nonaccess.modifiers;

  class FinalTest{
	
    final int THRESHOLD=5;// direct initialize 
    final int CAPACITY;  // blank final variable
    final int  MINIMUM;  // another blank final variable 
    
   static final double PI = 3.14; // static final variable -direct initialize  
   static final double ROI;  // a  blank static final variable
    
   // instance  block for initializing CAPACITY 
    { 
    	System.out.println("from instance block");
        CAPACITY = 25; 
    }
   
    
     // constructor for initializing MINIMUM. Note that if there are more than one 
    // constructor, you must initialize MINIMUM in them also.
     FinalTest(){
    	System.out.println("from constructor");
    	MINIMUM=10;
    	
    }
     
    
        
    
    // static  block for initializing ROI 
    static{ 
    	System.out.println("from static block");
    	ROI =10.49; 
    } 
    
     void  m1(){
	   System.out.println("FinalTest::from m1");
	   
	   
    }
   
}
 
 class Test extends FinalTest{
	 void  m1() {
		 System.out.println("Test::from m1");
	 }
 }



public class FinalDemo {
	
		public static void main(String[] args) {
		System.out.println("inside main method");
		
		FinalTest ft=new FinalTest();
		System.out.println(ft.THRESHOLD);
		System.out.println(ft.CAPACITY);
		System.out.println(ft.MINIMUM);
		
		System.out.println(FinalTest.PI);
		System.out.println(FinalTest.ROI);
		
		FinalTest t=new Test();
		t.m1();
		
	
		
	}

}
