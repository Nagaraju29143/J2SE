package training.java.string.manipulations;

import java.util.ArrayList;
import java.util.Collections;

public final class Emp {

	private final int empId;
	private final String empName;
	private final double salary;
	private final int age;
	
	//private final Address address;
	
	private final ArrayList<Address> address;
	
	
	public Emp(int empId, String empName, double salary, int age, ArrayList<Address> address) {
	this.empId = empId;
	this.empName = empName;
	this.salary = salary;
	this.age = age;
	this.address=address;
	
	 //deep copy
    /* Address tempaddr=new Address(address.getStreet(),address.getCity(),address.getState());
		
	 this.address=tempaddr;*/
	
	 // ArrayList<Address> tempAddrList=new ArrayList<>();
	  
	  /*for(Address addr:address) {
		  tempAddrList.add(addr);
		  
	  }*/
	  
	 // address.stream().forEach(a->tempAddrList.add(a));
	
	 // this.address=tempAddrList;
   }

	//getters
	public int getEmpId() {
		return empId;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public int getAge() {
		return age;
	}

	

	 /* public Address getAddress() throws CloneNotSupportedException { 
	     //return address;
		return (Address)address.clone(); 
		}*/
	
	public ArrayList<Address> getAddress() throws CloneNotSupportedException { 
		 //return address;
		
		return (ArrayList<Address>)address.clone(); 
		
		//return (ArrayList)Collections.unmodifiableCollection(address);
		
		}

	
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", age=" + age + ", address="
				+ address + "]";
	}
	
}
