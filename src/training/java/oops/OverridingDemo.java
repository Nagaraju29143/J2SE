package training.java.oops;

  class Parent { 
	 
	 void show()  { 
        System.out.println("Parent's show()"); 
    } 
	
	 public static void main(String[] args) {
	  System.out.println("Parent's main()"); 
	  }
     
     void m1() {
    	 System.out.println("Parent's m1()"); 
     }
} 
  
 class Child extends Parent { 
	
	//show(),m1()  from parent class
     
	  void show() { 
        System.out.println("Child's show()"); 
    }
	 
	 void m2() {
    	 System.out.println("Childs's m2()"); 
     }
	
	
	  public static void main(String[] args) {
	  System.out.println("Child's main()"); 
	  }
	 
} 
  

public class OverridingDemo {
	
	public static void main(String[] args) 
    { 

		
		//If a Parent type reference refers to a Parent object, then Parent's show is called 
		 /*Parent p = new Parent(); 
	     p.show();
	     p.m1();*/
		
		/*Child c=new Child();
		c.m2();
		c.m1();
		c.show();*/
		
        
       // If a Parent type reference refers  to a Child object Child's show() is called. This is called RUN TIME POLYMORPHISM/Dynamic Method Dispatch. 
         Parent obj2 = new Child(); 
          obj2.show();
          obj2.m1();
          obj2.main(args);
          
          //obj2.m2();
          //obj2.main(args);
          
          
       // Child c=new Parent();  // child type reference can not hold  parentobject
		
    }
}
