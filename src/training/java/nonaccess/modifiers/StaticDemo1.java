package training.java.nonaccess.modifiers;

class StaticTest{
	
	 static int a ; // static variable 
	   	int b ; // instance variable
	    	
	  StaticTest(){
	    		//static int z=10; //static varaible can not create in side constructor
	    	}
	  	
	    void m1() // instance method -we can call static and instance data
	    { 
	         //static int x ; // static varaible can not create in side method
	    	System.out.println("from m1");
	    	System.out.println("m1:a="+a);
	    	System.out.println("m1:b="+b);
	    	m2();
	    } 
	   static  void m2() // static method-1 - we can call only static data
	    {
		   //static int y = 10;
		   
	    	System.out.println("from m2");
	    	System.out.println("m2:a="+a);
	    	//System.out.println("m1:b="+b);
	    	m3();
	    	
	    	StaticTest obj=new StaticTest();
	    	System.out.println("m1:b="+obj.b);
	    	obj.m1();
	    	
	    }
	    static void m3() // static method-2- we can call only static data
	    {
	    	System.out.println("from m3");
	    	System.out.println("m3:a="+a);
	    	//System.out.println("m1:b="+b);
	    }
	    
}

public class StaticDemo1 {
	
 public static void main(String[] args) {
	   StaticTest st=new StaticTest();
	   st.m1();
	   //st.m2();
	   //st.m3();
	   //System.out.println(st.a);
	   
	   // StaticTest.m2();
	   // StaticTest.m3();
	  // System.out.println(StaticTest.a);
	   //StaticTest.m1();
	   
	   //local varaibles  
	   /* int i=0;
	   
	   for (int j=0;j<3;j++) {
		   i=i+j;
	   }
	    
	     System.out.println(i+"------"+j);*/
	}
 

}

