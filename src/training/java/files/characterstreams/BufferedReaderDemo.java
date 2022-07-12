package training.java.files.characterstreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader=new BufferedReader(new FileReader("D://Nag/J2SE Prgs/Files/test3.txt"));
		 
		  String currentLine=reader.readLine(); 
		  int count=0; 
		  while(currentLine!=null) {
			 
			  System.out.print(currentLine);
			  currentLine=reader.readLine();
			  count++;
		  }
		  
		  System.out.println("\ncount::"+count);
		  reader.close();
		 

	}

}
