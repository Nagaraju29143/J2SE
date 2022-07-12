
package training.java.inheritance;

class One {

	void m1() {
		System.out.println("Parent class:from One:m1 method ");
	}

}

class Two extends One {

	void m2() {
		System.out.println("Child class:from Two:m2 method");
	}
}

public class SingleDemo {

	public static void main(String[] args) {
		
		
		
		/*Two two = new Two();
		two.m2();
		two.m1();*/

		/*One one = new One();
		one.m1();
		one.m2();*/

		/*One one1 = new Two(); // parent reference can hold child object one1.m1(); //
		one1.m2();*/

		// Two two=new One(); //child class reference can not hold parent object.

	}

}
