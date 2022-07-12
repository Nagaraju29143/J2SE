package training.java.oops;

class Sample{
	
	void m4() {
		System.out.println("Sample::from m4");
	}
	
	
}

 class Test1 extends Sample implements Inf3 {

	public void m1() {
		System.out.println("Test1::from m1");
	}
	public void m2() {
		System.out.println("Test1::from m2");
		
	}
	public void m3() {
		System.out.println("Test1::from m3");
		
	}
	
	
}

 class Test2 implements Inf3{

	public void m1() {
		System.out.println("Test2-Inf1::from m1");
	}

	public void m2() {
		System.out.println("Test2::from m2");
	}

	public void m3() {
		System.out.println("Test2::from m3");
		
	}
	
	
}


public class InterfaceDemo2 {

	public static void main(String[] args) {
		
		Inf3 inf3=new Test1();
	
		inf3.m1();
		inf3.m2();
		inf3.m3();
	

	}

}
