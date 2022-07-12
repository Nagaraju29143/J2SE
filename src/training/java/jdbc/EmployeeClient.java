package training.java.jdbc;

import java.util.List;

public class EmployeeClient {
	
	public static void main(String[] args) {
		
		Employee empImpl=new EmployeeImpl();
		
	/*	EmployeeDto emp=empImpl.getEmployeeById(7788);
		System.out.println(emp);*/
		
		List<EmployeeDto> empList=empImpl.getAllEmployees();
		System.out.println("Size: "+empList.size());
		System.out.println(empList);
		
	}

}
