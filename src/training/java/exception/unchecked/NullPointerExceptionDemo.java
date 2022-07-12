package training.java.exception.unchecked;

public class NullPointerExceptionDemo {

	public static void main(String[] args) {
		String str = null;
		int l = str.length();// null.length()
		System.out.println("length:" + l);
	}

}
