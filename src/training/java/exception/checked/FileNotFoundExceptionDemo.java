package training.java.exception.checked;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundExceptionDemo  {
	
	public static void main(String[] args) {
    
		 try {
              FileReader reader  =new FileReader("D://Nag/J2SE Prgs/Files/test1.txt");
	          
              System.out.println("after file reader");
	         
	     }catch(FileNotFoundException ex) {
			 System.out.println("File not available"); 
		     ex.printStackTrace();
			  
		}
		
       
    } 

}

