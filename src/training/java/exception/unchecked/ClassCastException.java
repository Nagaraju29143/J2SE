package training.java.exception.unchecked;

public class ClassCastException {

	public static void main(String[] args) {
		
		
		 /* String str="java";//String--child class,Object-Parent class
		  Object obj=(Object)str; //converting string object to Object class object
		  System.out.println(obj.hashCode());*/
		 
		
		
		
		  Object obj1=new Object(); 
		  String str1=(String)obj1;//ClassCastException
		  System.out.println(str1.hashCode());
		 
		 
	}

}
