package training.java.files.bytestreams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class BufferedInputStreamDemo {

	public static void main(String[] args) throws IOException  {
		
		InputStream inputStream=new BufferedInputStream(new FileInputStream("D://Nag/J2SE Prgs/Files/test1.txt"));
		
		int i=0;
		
		while((i=inputStream.read())!=-1) {
			System.out.print((char)i);
		}
		
		inputStream.close();

	}

}
