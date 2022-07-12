package training.java.exception.handling;

import java.io.FileReader;
import java.io.IOException;

public class ThrowsDemo {

	public static void main(String[] args) throws IOException {
			/*Thread.sleep(1000);
        System.out.println("thread paused"); */
		
		/*int sum=add(10,20);
		System.out.println(sum);*/
		
		String name=ThrowsDemo.getName();
		System.out.println(name);
	}
	
	static int add(int i,int j) throws ArithmeticException{
		
		int k=(i+j)/10;
		return k;
	}
	
    static String getName() throws IOException{
    	FileReader reader=new FileReader("D://Nag/test.txt");
    	return "hello";
	}

}
