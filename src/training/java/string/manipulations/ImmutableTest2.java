package training.java.string.manipulations;


 class Employee {
    private final String empName;

    public Employee(String empName) {
        this.empName = empName;
    }

    public String getEmpName() {
        return empName;
    }
}

class EmployeeImpl extends Employee{
	
	private String newEmpName;

    public EmployeeImpl(String empName) {
        super(empName);
        newEmpName = empName;
    }

    public String getEmpName() {
        return newEmpName;
    }
    
    public void setNewEmpName(String newEmpName) {
    	this.newEmpName = newEmpName;
    }
	
}


public class ImmutableTest2 {
	
	public static void main(String[] args) {
		
		EmployeeImpl empImpl=new EmployeeImpl("test");
		
		Employee emp=(Employee)empImpl;
		System.out.println(emp.getEmpName());
		
		empImpl.setNewEmpName("ram");
		System.out.println(emp.getEmpName());
		
		

	}

}


