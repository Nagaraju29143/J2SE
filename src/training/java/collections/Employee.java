package training.java.collections;
public class Employee {
	private long   empId;
	private String firstName;
	private String lastName;
	
	public Employee() {
	}

	public Employee(long empId, String firstName, String lastName) {
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;
		}
		if (obj == null && !(obj instanceof Employee) && getClass() != obj.getClass() ){
			return false;
		}
	
		Employee other = (Employee) obj;
		if (empId != other.empId){
			return false;
		}
		if (firstName == null && other.firstName != null) {
			return false;
		} else if (!firstName.equals(other.firstName)){
			return false;
		}
		if (lastName == null && other.lastName != null) {
			return false;
		} else if (!lastName.equals(other.lastName)){
			return false;
		}	
		
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (empId ^ (empId >>> 32));
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}
	
	@Override
	public  String toString(){
		return "Employee1Id:"+empId+"firstName:"+firstName+"lastName:"+lastName;
	}

}
