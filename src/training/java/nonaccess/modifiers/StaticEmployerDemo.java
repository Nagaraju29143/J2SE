package training.java.nonaccess.modifiers;

 class EmployeeInfo  
{ 
	   int empNo;
	   String empName;
	   
	   static  String employerName; // static variable 
	   
		   
	   EmployeeInfo(String employerName){
		   this.employerName=employerName;
	   }
	   
	   EmployeeInfo(int empNo,String empName){
		   this.empNo=empNo;
		   this.empName=empName;
	   }
	   
	   void getEmployeeInfo() {
		   // accessing static variable 
	        System.out.println("employerName : " + EmployeeInfo.employerName);
	        
		   System.out.println("empNo : " + this.empNo); 
	       System.out.println("empName : " + this.empName); 
	   }
	   
}



public class StaticEmployerDemo {

	public static void main(String[] args) {
		
		EmployeeInfo employerName=new EmployeeInfo("XYZ pvt ltd");
		
		EmployeeInfo employee1=new EmployeeInfo(1,"abc");
		EmployeeInfo employee2=new EmployeeInfo(2,"pqr");
		
		employee1.getEmployeeInfo();
		employee2.getEmployeeInfo();
		
		

	}

}
