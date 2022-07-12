package training.java.files.characterstreams;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws IOException{
		   PrintWriter writer=new PrintWriter(new FileWriter("D://Nag/J2SE Prgs/Files/test4.txt"));
			
			writer.write(100); //d
			writer.write("\n");
			writer.println(100); //100
			writer.println("J");
			writer.println("Java");
			
			writer.close();
	}

}
