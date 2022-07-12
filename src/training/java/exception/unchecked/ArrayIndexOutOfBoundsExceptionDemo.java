package training.java.exception.unchecked;


public class ArrayIndexOutOfBoundsExceptionDemo {

	public static void main(String[] args) {
		String str[]=new String[3];
		
		str[0]="test0";
		str[1]="test1";
		str[2]="test2";
		System.out.println("before filling 3 position");
		str[3]="test3";
		System.out.println("after filling 3 position");
		
	}

}
