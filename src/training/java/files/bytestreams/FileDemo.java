package training.java.files.bytestreams;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException  {
		
		//Dir/folder creation
		/*File file=new File("D://Nag/J2SE Prgs/Files/IOStreams");
		file.mkdir();*/
		
		//file creation
		//one way
		/*File file1=new File("D://Nag/J2SE Prgs/Files/IOStreams/test.txt");
		file1.createNewFile();*/
		
		//second way
		/*File f=new File(file,"sample.pdf");
		f.createNewFile();*/
		

		/*File dir=new File("D://Nag/J2SE Prgs/Files/IOStreams1");
		dir.mkdir();
		System.out.println("Files dir created");
		
		if(dir.exists()) {
				File f1=new File(dir,"test1.xlsx");
				f1.createNewFile();
				
				File f2=new File(dir,"test2.pdf");
				f2.createNewFile();
			System.out.println("files created under Files dir");
	       }*/
		
		//displays all file names and sub directories
		File dir=new File("D://Nag/J2SE Prgs/Files");
		String[] str=dir.list();
		for(String s:str) {
			System.out.println(s);
		}
		
	
	}
}
