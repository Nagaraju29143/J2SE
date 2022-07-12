package training.java.files.bytestreams;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputputStreamDemo {

	public static void main(String[] args) throws IOException {
		
		DataInputStream inputStream=new DataInputStream(new FileInputStream("D://Nag/J2SE Prgs/Files/sample.txt"));
		
		double a = inputStream.readDouble(); 
		int b = inputStream.readInt(); 
        boolean c = inputStream.readBoolean(); 
        char d=inputStream.readChar(); 
        System.out.println("Values: " + a + " " + b + " " + c+" " + d); 
        inputStream.close();
	}

}
