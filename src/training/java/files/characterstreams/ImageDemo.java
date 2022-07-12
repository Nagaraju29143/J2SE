package training.java.files.characterstreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ImageDemo {

	public static void main(String[] args) throws IOException {
		
		BufferedReader	reader= new BufferedReader(new FileReader("D://Nag/J2SE Prgs/Files/img1/mobile1.png"));
		BufferedWriter writer = new BufferedWriter(new FileWriter("D://Nag/J2SE Prgs/Files/img3/mobile3.png"));
		
		int i;
		
		char[] buffer = new char[2048];
		int count=0;
		
		while((i=reader.read(buffer))!=-1) {
			writer.write(buffer,0,i);
			count++;
		}
		System.out.println(count);
		reader.close();
		writer.close();		
	}

}
