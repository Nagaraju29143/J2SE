package training.java.xml;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

public class JSONToXML {

	public static void main(String[] args) throws JSONException{
		
		//Reading JSON file from ReadJSONDemo class
		String jsonData=ReadJSONDemo.readJSONFromDisk();
		System.out.println("JSON Data:"+jsonData);
		
		//Converting XML into JSON
		JSONObject jsonObject=new JSONObject(jsonData);
		System.out.println("JSON Object:"+jsonObject);
		String xmlData = XML.toString(jsonObject);	
		System.out.println("XML Data:"+xmlData);
		 
	}

}
