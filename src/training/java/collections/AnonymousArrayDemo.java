package training.java.collections;

public class AnonymousArrayDemo {
	
	static void add(int[] ia) {
		 
		 int total =0;
		
		for(int i:ia) {
			total=total+i;
		}
		
		System.out.println("Total: "+total);
	}

	public static void main(String[] args) {
		
		add(new int[]{10,20,30});

	}

}
