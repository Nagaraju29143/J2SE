package training.java.string.manipulations;

public class StringDemo {

	public static void main(String[] args) {
	//Immutable
		 //String str="java";
		 /*String str=new String("java");
		 str.concat("training");
		 System.out.println(str);*/
		 
		 
	//Mutable
		 
		/* StringBuffer sb1=new StringBuffer("java"); 
		 sb1.append("training");
		 System.out.println(sb1);*/
		 
		/* StringBuffer sb=new StringBuffer();
		  sb.append("<Employee>");
		  sb.append("<id>100</id>");
		  sb.append("<name>ram</name>");
		  sb.append("</Employee>");
		  System.out.println(sb);*/
		  
		  
    //== vs equals() method
          /* String str1=new String("java");
           String str2=new String("java");
           
           System.out.println(str1==str2); //false
          System.out.println(str1.equals(str2));//true*/
          
     //Ex-1
         
         /*String s1=new  String("java");
         String s2=new  String("java");
         String s3="java";
         String s4="java";
         s4.concat("3");
         String s5="training";
         
         System.out.println(s1==s2); //false
         System.out.println(s1==s3); //false
         System.out.println(s2==s4);//false
         System.out.println(s3==s4);//true
         System.out.println(s1==s5);//false*
         
         System.out.println(s1.equals(s2)); //true
         System.out.println(s1.equals(s3)); //true
         System.out.println(s2.equals(s4)); //true
         System.out.println(s3.equals(s4)); //true
         System.out.println(s1.equals(s5)); //false*/
        
 

     //Ex-2
		
		 /* String s1=new String("java");
		  s1.concat("training");
		  s1.concat("solutions"); 
		  String s2=s1.concat("soft");
		  
		  System.out.println(s1);
		  System.out.println(s2); 
		  System.out.println(s1==s2);
		  System.out.println(s1.equals(s2));*/
		  
	 //Ex-3
		
		 /*  String s1="spring";
		   String s2=s1+"summer";
		   s1.concat("falls");
		   s2.concat(s1);
		   s1+="winter";//s1=s1+"winter"
		   System.out.println(s1);
		   System.out.println(s2);
		   System.out.println(s1==s2);
		   System.out.println(s1.equals(s2));*/
		
	//Ex-4
        	/*String s1=new String("javatraining"); 
        	String s2=new String("javatraining"); 
        	System.out.println(s1==s2);
        
        	String s3="javatraining"; 
        	String s4="javatraining";
		   System.out.println(s1==s3);
		   System.out.println(s1==s4);
		   
		   String s5="java"+"training";
		   System.out.println(s3==s5);
		   
		   String s6="java";
		   String s7=s6+"training";
		   System.out.println(s3==s7);
		   
		   final String s8="java";
		   String s9=s8+"training";
		   System.out.println(s3==s9);
		   System.out.println(s6==s8);*/
		 
		
		
		String s = "javatraining";
		
		/*String[] s1 = s.split(" ");
		for(int i=0;i<s1.length;i++) {
		
		    System.out.println(s1[i]);
			
		}
		
		System.out.println(s.charAt(8));
		System.out.println(s.length());
		System.out.println(s.equalsIgnoreCase("JavatRaining"));
		System.out.println(s.equals("JavatRaining"));
		System.out.println(s.trim().length());
		System.out.println(s.replace('a', 'A'));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.substring(2, 7));
		System.out.println(s.contains("train"));
		System.out.println(String.format("ja%s", "VA"));*/
		  
		 
		
		
		 /*final StringBuilder sb=new StringBuilder("java");
		  // sb=new StringBuilder("training");
		  sb.append("test");
		 System.out.println(sb);*/
		
		 
		 String str1=new String("java");
         String str2=new String("java");
        System.out.println(str1.equals(str2));
        
		StringBuilder sb1=new StringBuilder("java");
		StringBuilder sb2=new StringBuilder("java");
        System.out.println(sb1.equals(sb2)); //sb1==sb2
        
        StringBuffer sbb1=new StringBuffer("java");
        StringBuffer sbb2=new StringBuffer("java");
        System.out.println(sbb1.equals(sbb2)); //sb1==sb2
        
		
		
            
	}

}
