package training.java.exception.unchecked;

public class NumberFormatExceptionDemo {

	public static void main(String[] args) {
		String str="hello";
		
		int i=Integer.parseInt(str);
		System.out.println("Result="+i);

	}

}
