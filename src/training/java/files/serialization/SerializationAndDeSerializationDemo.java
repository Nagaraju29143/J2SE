package training.java.files.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class Employee implements Serializable {

	private int empId;
	private   transient String empName;
	private   transient double salary;
	private   transient  final int age;
	private   transient static String address;
	
	
	public Employee(int empId, String empName, double salary, int age,String address) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.age = age;
		this.address=address;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", age=" + age+ ", address=" + address+" ]";
	}

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

	public static String getAddress() {
		return address;
	}
	
	
	
}

public class SerializationAndDeSerializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Employee emp=new Employee(100,"Rama",60000,25,"Hyd");
		
		//Serialization
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D://Nag/J2SE Prgs/Files/emp.txt"));
		oos.writeObject(emp);
		oos.close();
		
		//De-Serialization
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D://Nag/J2SE Prgs/Files/emp.txt"));
		Employee emp1=(Employee)ois.readObject();
		
		System.out.println(emp1);
		
		System.out.println(emp1.getEmpId());
		System.out.println(emp1.getEmpName());
		System.out.println(emp1.getSalary());
		System.out.println(emp1.getAge());
		System.out.println(emp1.getAddress());
	
	}

}
