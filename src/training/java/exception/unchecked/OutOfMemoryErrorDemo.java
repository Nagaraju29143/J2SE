package training.java.exception.unchecked;

class OutOfMemoryError{
	static void display() {
		String[] str = new String[1000*1000*1000];
		System.out.println("Done");
		}
}

public class OutOfMemoryErrorDemo {

	public static void main(String[] args) {
		OutOfMemoryError.display();
	}

}
