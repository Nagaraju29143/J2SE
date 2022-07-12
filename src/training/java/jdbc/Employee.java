package training.java.jdbc;

import java.util.List;

public interface Employee {
	
	EmployeeDto getEmployeeById(int empId);
	List<EmployeeDto>  getAllEmployees();

}
