package training.java.string.manipulations;

public class StringConverionsDemo {

	public static void main(String[] args) {
		
		   
         
	//case-1 From String to StringBuffer and StringBuilder 	    
	        // conversion from String object to StringBuffer 
		/* String str = "Java"; 
	        
	        StringBuffer sbr = new StringBuffer(str); //converts String to StringBuffer
	        sbr.reverse(); 
	        System.out.println(sbr); 
	          
	        // conversion from String object to StringBuilder 
	         StringBuilder sbl = new StringBuilder(str); //converts String to StringBuilder
	        sbl.append("Training"); 
	        System.out.println(sbl);*/
	  
	 //case-2 From StringBuffer/StringBuilder to String 
		    
	        
	     // conversion from StringBuffer object to String 
	       /* StringBuffer sbr = new StringBuffer("Java"); 
	        
	        String str1 = sbr.toString(); 
	        System.out.println(str1);
	        
	     // conversion from StringBuilder object to String 
	         StringBuilder sbl = new StringBuilder("Training");
	        String str2 = sbl.toString(); 
	        System.out.println(str2); */
	        
	     
	     // changing StringBuffer object sbr 
	     // but String object(str1) doesn't change 
	        /*sbr.append("Test"); 
	        System.out.println(sbr); 
	        System.out.println(str1);*/ 
	        
	 //case-3 From StringBuffer to StringBuilder or vice-versa : 
	        
	       StringBuffer sbr = new StringBuffer("JavaTraining"); 
	          
	        // conversion from StringBuffer object to StringBuilder 
	        String str = sbr.toString(); 
	        
	        StringBuilder sbl = new StringBuilder(str); 
	          
	       System.out.println(sbl); 
	        
	        

	}

}
