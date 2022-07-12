package training.java.files.characterstreams;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo  {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter writer=new FileWriter("D://Nag/J2SE Prgs/Files/test1.txt");
		
		writer.write(100);
		writer.write("\n");
		writer.write("This is FileWriterDemo");
		writer.write("\n");
		char[] ch={'a','b','c'};
		writer.write(ch);
		
		writer.close();
		
	}
		
	

}
