package training.java.files.bytestreams;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class BufferedOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		String str="Welcome to BufferedOutputStream which is used to write data to destination.";
		
		BufferedOutputStream outputStream =new BufferedOutputStream(new FileOutputStream("D://Nag/J2SE Prgs/Files/test3.txt"));
			
	    outputStream.write(str.getBytes());
	    outputStream.write(97);
	    outputStream.write('A');
			
		outputStream.flush();
		outputStream.close();
		

	}

}
