package training.java.exception.unchecked;

class StackOverflow{
	static void m1() {
		m2();
	}
	static void m2() {
		m1();
		
	}
}
public class StackOverflowDemo {

	public static void main(String[] args) {
		StackOverflow.m1();
	}

}
