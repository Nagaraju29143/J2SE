package training.java.nonaccess.modifiers;

public class StaticBlockDemo {

	// static variable 
    static int a = 10; 
    static int b; 
    
    StaticBlockDemo(){
    	System.out.println("default constructor "+a);
    }
    
    //instance block
    {
    	System.out.println("from instance block "+b);
    }
   
    
    // static block 
    static { 
        System.out.println("Static block-1 initialized."); 
        b = a * 4;
        System.out.println("Value of b : "+b);
    } 
    static {
    	System.out.println("Static block-2 initialized.");
    	a=a+4;
    	System.out.println("Value of a : "+a);
    }
    
    
	
	public static void main(String[] args) {
		System.out.println("from main"); 
		
		StaticBlockDemo obj=new StaticBlockDemo();
		
	}

}
