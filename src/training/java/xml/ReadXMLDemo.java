package training.java.xml;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
public class ReadXMLDemo {
	
	public static String  readXml() {
		String resXml="";
		InputStream inputStream = ReadXMLDemo.class.getClassLoader().getResourceAsStream("training/java/xml/testresponse.xml");
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(inputStream));
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

