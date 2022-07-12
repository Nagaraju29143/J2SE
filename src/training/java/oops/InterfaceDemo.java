package training.java.oops;

interface Bank{  
	
	
	//variable/datamember/field
    int balance=10; //by default public static final
	
	//abstract method
   float rateOfInterest();  //by default public abstract
   
   
   //java 1.8
	 static void m2() {
		System.out.println("from static");
	}

	default void m3() {
		System.out.println("from default");
	}
}  
  class SBI implements Bank{  
	public float rateOfInterest(){
		return 9.4f;
		} 
	
	
}  
class IOB implements Bank{  
	public float rateOfInterest(){
		return 8.7f;
		} 
}  

public class InterfaceDemo {
	public static void main(String[] args) {
	//Bank b=new Bank();
	Bank bank=new IOB();
	System.out.println(bank.rateOfInterest());
	
	/* Bank.m2();
	 bank.m3();*/
	}
}
