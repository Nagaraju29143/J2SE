package training.java.collections;

import java.util.Comparator;

//public class Customer implements Comparable<Customer> {
public class Customer implements Comparator<Customer>{
//public class Customer{
	private int custId;
	private String custName;
	private int age;
	
	public Customer() {
		
	}

	public Customer(int custId, String custName, int age) {
		this.custId = custId;
		this.custName = custName;
		this.age = age;
	}

	public int getCustId() {
		return custId;
	}

	public String getCustName() {
		return custName;
	}

	public int getAge() {
		return age;
	}

	/*@Override
	public int compareTo(Customer cust) {

		// Customer cust=(Customer)obj;

		return (this.age - cust.age);
	}*/
	
	@Override
	public int compare(Customer c1, Customer c2) {

		//return c1.custName.compareTo(c2.custName);
		return (c1.age-c2.age);
	}

	/*static Comparator<Customer> idComparator = new Comparator<Customer>() {

		@Override
		public int compare(Customer c1, Customer c2) {

			return -(c1.custId - c2.custId);
		}

	};

	static Comparator<Customer> nameComparator = new Comparator<Customer>() {

		@Override
		public int compare(Customer c1, Customer c2) {

			return c1.custName.compareTo(c2.custName);
		}

	};

	static Comparator<Customer> ageComparator = new Comparator<Customer>() {

		@Override
		public int compare(Customer c1, Customer c2) {

			return (c1.age - c2.age);
		}

	};*/
	
	
	public boolean equals(Object obj) {
		
		if(this==obj) {
			return true;
		}
		
		if(obj==null || this.getClass()!=obj.getClass()) {
			
			return false;
		}
		
		Customer cust= (Customer)obj;
		
	   return this.getCustId()==cust.getCustId() && this.getCustName()==cust.getCustName() && this.getAge()==cust.getAge();
	}
	
	public int hashCode() {
		
		int hash=(int)this.getCustName().charAt(0);//s
		
		return hash;
		
	}

	
	@Override
	public String toString() {
		return "[custId=" + custId + ", custName=" + custName + ", age=" + age + "]";
	}
}