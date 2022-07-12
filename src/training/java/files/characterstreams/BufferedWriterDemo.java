package training.java.files.characterstreams;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
	
	public static void main(String[] args) throws IOException {
		
		BufferedWriter writer= new BufferedWriter(new FileWriter("D://Nag/J2SE Prgs/Files/test3.txt"));
		
		writer.write(100);
		writer.newLine();
		writer.write("This is BufferedWriterDemo");
		writer.newLine();
		char[] ch={'a','b','c'};
		writer.write(ch);
		
		writer.flush();
		writer.close();
		
	}

}
