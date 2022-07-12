package training.java.files.characterstreams;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		
		FileReader reader  =new FileReader("D://Nag/J2SE Prgs/Files/test1.txt");
          
          int i;  
          int count=0; 
          while((i=reader.read())!=-1) {
        	  System.out.print((char)i); 
        	 count++;
          }
          System.out.println("\ncount::"+count);
          reader.close();    
	}

}
