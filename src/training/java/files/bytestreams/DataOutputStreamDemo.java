package training.java.files.bytestreams;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		DataOutputStream outputStream=new DataOutputStream(new FileOutputStream("D://Nag/J2SE Prgs/Files/sample.txt"));
		
		outputStream.writeDouble(1.1); 
		outputStream.writeInt(97); 
		outputStream.writeBoolean(true); 
		outputStream.writeChar('R'); 
		
		outputStream.flush();
		outputStream.close();

	}

}
