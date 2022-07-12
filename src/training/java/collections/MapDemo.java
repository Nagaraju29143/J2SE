package training.java.collections;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) throws Exception {
		Customer c1=new Customer(100,"sai",25);
		Customer c2=new Customer(200,"test",30);
		Customer c3=new Customer(300,"hari",29);
		Customer c4=new Customer(200,"test",30);
		
		Map<Integer,Integer> map=new HashMap<>();

		map.put(10,25);
		map.put(20,30);
		map.put(30,15);
		map.put(40,10);
		
		
		
		Set<Integer> keySet = map.keySet();
		
        //using enhanced for loop
		/*for (Integer key : keySet) {

			if(map.get(key)>15) {
			System.out.println(map.get(key));// test1,test2,test3,test4
			}

		}*/
		
		//using iterator
		/*Iterator<Integer> itr=keySet.iterator();
		
		while(itr.hasNext()) {
			System.out.println("value: "+map.get(itr.next()));
		}*/
		
		Set<Entry<Integer, Integer>> entrySet=map.entrySet();
		
		for(Entry<Integer, Integer> entry:entrySet) {
		 System.out.println(entry.getKey()+"--"+entry.getValue());
		}
		/*Map<Integer,String> map=new HashMap<>();
		
		System.out.println(map.put(10,"ten")); //null
		System.out.println(map.put(20,"twenty"));//null
		System.out.println(map.put(30,"thirty"));//null
		System.out.println(map.put(10,"tenten"));//ten*/
		
		/*Map map=new LinkedHashMap();
		//Map<Integer,String> map=new HashMap<>();
		map.put(10,"ten");
		map.put(30,"thirty");
		map.put("fourty","fourty40");
		map.put(30,"thirty1");
		map.put(null,"test");
		map.put("test","test123");*/
		
		//System.out.println("Size:"+map.size()+"--"+map);
		
		/*map.put(c1, c1);
		map.put(c2, c2);
		map.put(c3, c3);
		map.put(c4, c4);*/
		
		/*System.out.println("Size:"+map.size()+"--"+map);
		
		System.out.println(map.get(c2));
		System.out.println(map.containsKey(c4));
		System.out.println(map.containsValue("fourty40"));
		System.out.println(map.remove(null));
		System.out.println("after removed null: "+map.size()+" "+map);
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());*/
		
		
		/*Set  set=map.keySet();
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			Object key=itr.next();
			Object value=map.get(key);
			System.out.println(key+"::"+value);
			
		}*/
		
		/*Set  set=map.keySet();
		for(Object key:set) {
			Object value=map.get(key);
			System.out.println(key+"::"+value);
			
		}*/
	
       /* for(Map.Entry<Integer,String> entry: map.entrySet())	{
        	System.out.println(entry.getKey()+"--"+entry.getValue());
        }*/
        		
		
		
		
		/*Hashtable ht=new Hashtable();
		
		ht.put(10,"ten");
		ht.put(20,"twenty");
		ht.put(30,"thirty");
		ht.put(30,"thirty123");
		ht.put("fourty","fourty");
		//ht.put(null,"test");
		ht.put("test",null);
		
	    System.out.println(ht);*/
		
		/*Properties props = new Properties();
		
		props.put("a", "one");
		props.put("b", "two");
		props.put("c", "three");
		props.put(10, "three");
		//props.put(null,"test");
		//props.put("test",null); 	
		
		System.out.println(props);*/
		
		/*Enumeration e=props.elements();
		 
		 while(e.hasMoreElements()){
			   Object obj=e.nextElement();
			  
			   System.out.println(obj);
			   }*/
		
		
		/*FileReader reader  =new FileReader("D://Nag/J2SE Prgs/Files/database.properties");
		Properties props = new Properties();
		props.load(reader);
		//System.out.println(props);
		System.out.println(props.getProperty("db.postgre.url"));
		System.out.println(props.getProperty("db.postgre.pwd"));
		System.out.println(props.getProperty("db.postgre.driver"));*/
		
		
		/*FileWriter writer  =new FileWriter("D://Nag/J2SE Prgs/Files/database.properties");
		Properties props = new Properties();
		props.setProperty("db.postgre.pwd", "test12345");
		props.store(writer, "updated database props");*/
		
		/*Properties dbProps=new MapDemo().getDbProperties();
		System.out.println(dbProps);
		System.out.println(dbProps.getProperty("db.postgre.uname"));
		System.out.println(dbProps.getProperty("db.postgre.pwd"));*/
		
		
		
	}

	
	
	private  Properties getDbProperties() throws IOException {
		Properties dbProps = new Properties();
	    InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("training/java/collections/database.properties");
	    
	    dbProps.load(inputStream);
	    
	    return dbProps;
	   
	}
}
