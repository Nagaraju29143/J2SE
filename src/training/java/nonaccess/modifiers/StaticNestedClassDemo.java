package training.java.nonaccess.modifiers;

class OuterClass 
{  
    static int x = 10; 
    int y = 20; 
    private static int z= 30; 
      
    // static inner class 
    static class StaticInnerClass 
    { 
        void display() 
        { 
            System.out.println("outer_x = " + x); 
            //System.out.println("outer_y = " + y); 
            System.out.println("outer_z = " + z); 
              
          
        } 
    } 
} 


public class StaticNestedClassDemo {

	public static void main(String[] args) {
		
		OuterClass.StaticInnerClass nestedObject = new OuterClass.StaticInnerClass(); 
        
        nestedObject.display(); 
	}

}
