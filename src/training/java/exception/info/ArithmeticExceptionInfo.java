package training.java.exception.info;

public class ArithmeticExceptionInfo {

	public static void main(String[] args) {
		try {
			int a = 20 / 0;
		} catch (ArithmeticException e) {
			System.out.println("===========================");
			e.printStackTrace();
			System.out.println("===========================");
			System.out.println(e.getMessage());
			System.out.println("===========================");
			System.out.println(e.toString());

		}

	}

}
