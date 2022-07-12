package training.java.modifiers.p2;


import training.java.modifiers.p1.TestA;

public class TestB extends TestA {

	public static void main(String[] args) {
		TestB b=new TestB();
		 // b.m1(); //default can not be accessed
		// b.m2(); //private can not be accessed
		 b.m3(); //protected
		 b.m4();   //public

	}

}

class B{
	public static void main(String[] args) {
	TestA testa=new TestA();
	//testa.m1(); //default
	//testa.m2(); //private
	// testa.m3(); //protected
	 testa.m4(); //public
	}
	
}

 
