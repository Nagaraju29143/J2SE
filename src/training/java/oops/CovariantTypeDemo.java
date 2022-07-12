package training.java.oops;

class A{
	
}

class B extends A{
	
}

class C{
	
}

class Base{
	
	A m1(int i,int j) {
		System.out.println("from Base:m1()");
		A a=new A();
		return a;	
	}
}
class Derived extends Base{
	
	B m1(int i,int j) {
			System.out.println("from Derived:m1()");
			B b=new B();
			return b;
	}
}

public class CovariantTypeDemo {
	public static void main(String[] args) 
    { 
		Derived b=new Derived();
		b.m1(10,20);
    }
}
