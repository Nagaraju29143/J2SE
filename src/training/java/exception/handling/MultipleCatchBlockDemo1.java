package training.java.exception.handling;

public class MultipleCatchBlockDemo1 {

	public static void main(String[] args) {
		try {
			int[] a = new int[5];
			System.out.println(a[6]);// AIOBE
		} 
		
		/*catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");
		} catch (Exception e) {
			System.out.println("Parent Exception occurs");
		}*/

		// java1.7- we can handle multiple exceptions in a single catch block

		
		catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException ex) {

			System.out.println("Exception occurs");

		}
		 

		System.out.println("rest of the code");

	}

}
