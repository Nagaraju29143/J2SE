package training.java.files.bytestreams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamDemo {

	public static void main(String[] args)  {
		
		String str="Welcome to java OutputStreams which is used to write data to destination.";
		
		OutputStream outputStream=null;
		try {
			outputStream = new FileOutputStream("D://Nag/J2SE Prgs/Files/test1.txt");
			// for appending data
			// outputStream=new FileOutputStream("D://Nag/J2SE Prgs/Files/test1.txt",true);
			outputStream.write(str.getBytes());
			outputStream.write(97);
			outputStream.write(114);

		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
		   
		finally {
		    	 try {
					outputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		    }
		
		/* OutputStream outputStream=new FileOutputStream("D://Nag/J2SE Prgs/Files/test2.txt",true);
		 outputStream.write(str.getBytes());
		 outputStream.close();*/
	      
		System.out.println("outputStream written data into test1.txt");
		
		
	}

}
