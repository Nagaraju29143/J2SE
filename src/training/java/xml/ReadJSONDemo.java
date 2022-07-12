package training.java.xml;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadJSONDemo {
	
	public static String  readJSONFromDisk() {
		String resXml="";
		File file=new File("D://Nag/Files/student.txt");
		try {
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			String inputLine=null;
			StringBuffer sb=new StringBuffer();
			while((inputLine=br.readLine())!=null) {
				sb.append(inputLine);
			}
			resXml= sb.toString();
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return resXml;
	}

}
