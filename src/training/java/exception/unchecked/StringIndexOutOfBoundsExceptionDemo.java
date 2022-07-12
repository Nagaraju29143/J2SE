package training.java.exception.unchecked;

public class StringIndexOutOfBoundsExceptionDemo {

	public static void main(String[] args) {
		String str="hello";
		System.out.println("Result="+str.charAt(0));
		System.out.println("Result="+str.charAt(1));
		System.out.println("Result="+str.charAt(2));
		System.out.println("Result="+str.charAt(3));
		System.out.println("Result="+str.charAt(4));
		System.out.println("Result="+str.charAt(5));
	}

}
