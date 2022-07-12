package training.java.nonaccess.modifiers;

class B{
	/*
	 * String m1() { return "la"; }
	 */
	 
	 static String m1() {
			return "la";
		}
}

class A extends B{
	
	/*
	 * String m1() { return "fa"; }
	 */
	
	static String m1() {
			return "fa";
		}
}

public class StaticDemo3 {

	public static void main(String[] args) {
		
		 A a=new A();
		 B b= new A();
		 
		 System.out.println(a.m1()+" "+b.m1());

	}

}
