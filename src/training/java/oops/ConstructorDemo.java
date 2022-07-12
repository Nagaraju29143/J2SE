package training.java.oops;

 class Employee {
	 int empId;
	 String empName;

	Employee() { 
		this(10); 
		System.out.println("default-constructor");
		empId = 100;
		empName = "Ram";
		m1();
	   }

	  Employee(int id) {
		  this(50,"sai",25);
		System.out.println("1-param-constructor ");
		empId = id;
	}
                      
	   Employee(int empId, String empName) { 
		this();
		System.out.println("2-param-constructor ");
		this.empId = empId;
		this.empName = empName;
	}

	    Employee(int id, String name, int i) { 
		System.out.println("3-param-constructor:"+i);
		empId = id;
		empName = name;
	}

	    void m1() {
		// this();//Constructor call must be the first statement in a constructor
		
		//final int i=10;//Illegal modifier for parameter i; only final is permitted
		
		System.out.println("from m1 method" );

	}
	
	/*public static void main(String[] args) {
		Employee e = new Employee();

		System.out.println("ID: " + e.empId);
		System.out.println("NAME: " + e.empName);
	}*/

}

 public class ConstructorDemo {

	public static void main(String[] args) {

		// this would invoke default constructor which is created by JVM.
		// Employee e = new Employee();


		  Employee e = new Employee(150, "TEST");
		 // Employee e= new Employee(200,"RAM",75);
		 // Employee e= new Employee();
		 // Employee e = new Employee();

		System.out.println("ID: " + e.empId);
		System.out.println("NAME: " + e.empName);

	}

}
