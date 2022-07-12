package training.java.xml;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

public class XMLToJSON {
	public static void main(String[] args) throws JSONException {
		//Reading XML from ReadXmlDemo class
		String resXml=ReadXMLDemo.readXml();
		System.out.println("XML after reading::"+resXml);
		
		//Converting XML into JSON
		JSONObject jsonObj=XML.toJSONObject(resXml);
		System.out.println(jsonObj);
		
		//Accessing JSON fileds
		jsonObj=jsonObj.getJSONObject("XML");
		
		JSONObject jsonObjHeader=jsonObj.getJSONObject("Header");
		jsonObjHeader=jsonObjHeader.getJSONObject("ResponseHeader");
		jsonObjHeader=jsonObjHeader.getJSONObject("HostTransaction");
		String status=String.valueOf(jsonObjHeader.get("Status"));
		System.out.println("Status::"+status);
		if("SUCCESS".equals(status)) {
			JSONObject	jsonObjBody=jsonObj.getJSONObject("Body");
			jsonObjBody=jsonObjBody.getJSONObject("executeFinacleScriptResponse");
			jsonObjBody=jsonObjBody.getJSONObject("executeFinacleScript_CustomData");
			String salutation=String.valueOf(jsonObjBody.get("Salutation"));
			System.out.println("Salutation::"+salutation);
		}
		
	}

}
