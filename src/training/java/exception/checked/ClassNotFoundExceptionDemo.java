package training.java.exception.checked;

public class ClassNotFoundExceptionDemo {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("class loadded...");
		} catch (ClassNotFoundException e) {
			System.out.println("class not loadded...");
			e.printStackTrace();
		}
	}

}
