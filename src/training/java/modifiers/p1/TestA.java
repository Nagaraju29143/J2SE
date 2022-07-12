package training.java.modifiers.p1;

public class TestA {

	void m1() {
		System.out.println("default: from m1");
		m2();
		m3();
		m4();

	}

	private void m2() {
		System.out.println("private: from m2");

	}

	protected void m3() {
		System.out.println("protected: from m3");

	}

	public void m4() {
		System.out.println("public: from m4");

	}

	public static void main(String[] args) {
		TestA testa = new TestA();
		testa.m1();
	}

}

class A extends TestA {

	public static void main(String[] args) {
		A a = new A();
		a.m1();
		 //a.m2();
		a.m3();
		a.m4();
	}
}

class A1 {
	public static void main(String[] args) {
		TestA testa = new TestA();
		testa.m1();
		// testa.m2();
		testa.m3();
		testa.m4();
	}
}
