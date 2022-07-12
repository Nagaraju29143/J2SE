package training.java.files.bytestreams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageDemo {

	public static void main(String[] args) throws IOException {
		
		BufferedInputStream	bis= new BufferedInputStream(new FileInputStream("D://Nag/J2SE Prgs/Files/img1/mobile1.png"));//1,272,757 bytes
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D://Nag/J2SE Prgs/Files/img2/mobile2.png"));
		
		int i;
		
		byte[] buffer = new byte[2048];
		int count=0;
		while((i=bis.read(buffer))!=-1) {
			bos.write(buffer,0,i);
			count++;
		}
		System.out.println(count);
		
		bos.flush();
		bis.close();
		bos.close();		
	}

}
