package training.java.oops;


 abstract class Parentt {
	
	// constructor
		Parentt() {
			System.out.println("from Parent constructor");
			}

	// concrete methods- with method body
	 void m1() {System.out.println("from m1");}

	void m2() {System.out.println("from m2");}

	// abstract methods-with out method body
	 abstract void m3();
	 abstract int m4();


	// static and final method
	static final void m5() {System.out.println("from static final m5 method");}
	
	/*public static void main(String[] args) {
		System.out.println("AB class main method");
	}*/

}


   class Childd extends Parentt{

	Childd() {
		System.out.println("from child constructor");
		}
	
	//void m1() {System.out.println("Childd::from m1");}
	
	void m3() {
		System.out.println("from m3");
		}
	int m4() {
		System.out.println("from m4");
		return 10;
	}
}

public class AbstractDemo2 {
	public static void main(String[] args) {
		// direct object creation not possible for abstract class Parent
		  //Parentt p=new Parentt();
		

		// indirect object creation for abstract class Parent
		// we have to create object for a class which extends that abstract class.
		
		Parentt p = new Childd();
		p.m4();
		p.m3();
		p.m2();
		p.m1();
		Parentt.m5();
		 

	}

}