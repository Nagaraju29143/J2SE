package training.java.string.manipulations;

public class Memory {
	
	int x=10;
	static int j=20;
	static {
		
	}
	
	void test(Object param) {
		
		String str=param.toString();
		
		System.out.println(str);
	}
	
	
	public static void main(String[] args) {
		int i=1;
		Object obj=new Object();
		
		Memory mem=new Memory();
		mem.test(obj);
		
	}

}
