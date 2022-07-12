package training.java.collections;


class Person{
	
	private String name;

    public Person(){
		
	}
	public Person(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	
	
}

class Emp extends Person{
	private  int empId;
	private  String empName;
	private  double salary;
	
	public Emp(int empId, String empName, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
	}

	  
}

class Customerr extends Person{
	 int custId;
	 String custName;
	 int age;
	
	public Customerr(int custId, String custName, int age) {
		this.custId = custId;
		this.custName = custName;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Customerr [custId=" + custId + ", custName=" + custName + ", age=" + age + "]";
	}

	
	
	
}

class Vehicle{
	private int vid;
	private String vname;
	
	public Vehicle(int vid, String vname) {
		super();
		this.vid = vid;
		this.vname = vname;
	}

	@Override
	public String toString() {
		return "Vehicle [vid=" + vid + ", vname=" + vname + "]";
	}
	
	
	
	
}


public class ArraysDemo {

	public static void main(String[] args) {
      	
       //array declaration	
	   //int[] ia=new int[5];
      
       //array initialization
	   
     /*  ia[0]=10;
       ia[1]=20;
       ia[2]=30;
       ia[3]=40;
       ia[4]=50;*/
      
       
  // array declaration & initialization	
     //  int[] ia = { 10,20,30,40,50 };
    
       
       
  //accessing elements froms array 
       
	       /*for(int i=0;i<ia.length;i++) {
	    	   System.out.println(ia[i]);
	       }*/
       
	       /*for(int i:ia) {
	    	   System.out.println(i);
	       }*/
		
  //Array assignments
		// int[] ia=new int[5];
	     //double[] ia=new double[5];
		// String[] ia=new String[5];
		
		/*ia[0]=10;
		ia[1]='a';
		
		 
		ia[2]=10l;
		ia[3]=10.25;
		ia[4]="test";*/
	       
	 
 // Custom Array assignments	
		/*Emp[] ea=new Emp[5]; 
	    
	    ea[0]=new Emp(10,"ram",100.15);
	    ea[1]=new Emp(20,"test",200.25);
	    ea[2]=null;
	    ea[3]=new Customer(100,"sai",25); //incompatable type
	    
	    for(Emp e:ea) {
	    	System.out.println(e);
	    }*/
	    
	    /*Customer[] ca=new Customer[5] ;
	    
	    ca[0]=new Customer(100,"sai",25);
	    ca[1]=new Customer(100,"ganesh",25);
	    ca[2]=null;
	    ca[3]=new Emp(10,"ram",100.15);*/ //incompatable type
	    
	    /* Person[] pa=new Person[5];
	    //Person[] pa= {new Person("p1"), new Emp(10,"ram",100.15), new Customer(100,"sai",25)}; 
	    
	    pa[0]=new Person("p1");
	    pa[1]=new Emp(10,"ram",100.15);
	    pa[2]=new Customerr(100,"sai",25);
	   // pa[3]=new Vehicle(125,"pulsar"); ////incompatable type*/
	    
	    Object[] oa=new Object[5];
	    oa[0]=new Person("p1");
	    oa[1]=new Emp(10,"ram",100.15);
	    oa[2]=new Customerr(100,"sai",25);
	    oa[3]=new Vehicle(125,"pulsar");
	    
	    for(Object obj:oa) {
	    	System.out.println(obj);
	    }
	     
	}

}
