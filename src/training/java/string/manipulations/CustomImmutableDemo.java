package training.java.string.manipulations;
//https://codepumpkin.com/immutable-class-with-mutable-member-fields-in-java/
import java.util.ArrayList;

public class CustomImmutableDemo {

	public static void main(String[] args) throws CloneNotSupportedException{
		
		Address address= new Address("test1","hyd1","Telangana");
		
		ArrayList<Address> addrList=new ArrayList<>();
		
		addrList.add(new Address("test1","hyd1","Telangana1"));
		addrList.add(new Address("test2","hyd2","Telangana2"));
		addrList.add(new Address("test3","hyd3","Telangana3"));
		
		//Emp emp=new Emp(100,"rama",1000,25,address);
		
		Emp emp=new Emp(100,"rama",1000,25,addrList);
		//Emp emp=new Emp(100,"rama",1000,25);
		System.out.println(emp);
		
		  //emp.salary=4000;
		 // emp.age=29;
		
	    // address.setState("AndhraPradesh");
		
		/*Address  addr1=emp.getAddress();
		addr1.setState("TN");*/
		
		//addrList.add(new Address("test4","hyd4","Telangana4"));
		
		 ArrayList<Address> addrList1= emp.getAddress();
	    addrList1.remove(0);
		 
		 System.out.println(emp);

		

	}

}
