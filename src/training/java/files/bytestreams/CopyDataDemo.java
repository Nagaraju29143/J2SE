package training.java.files.bytestreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDataDemo {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("D://Nag/J2SE Prgs/Files/test1.txt");
		FileOutputStream fos = new FileOutputStream(new File("D://Nag/J2SE Prgs/Files/test2.txt"));
		
		int i;
		while((i=fis.read())!=-1) {
			fos.write(i);
		}
		
		fis.close();
		fos.close();
      
	}

}
