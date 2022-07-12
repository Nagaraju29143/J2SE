package training.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		
		Class.forName("org.postgresql.Driver"); 
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres", "postgres123$");
		System.out.println("Connected to PostgreSQL database!\n");
		
		//DRL operations
		// PreparedStatement pst1 = con.prepareStatement("select * from emp ");
		 
		  PreparedStatement pst1 = con.prepareStatement("select * from emp where empno=? and ename=? and job=?");
		
		  pst1.setInt(1, 7788);
		  //pst1.setString(2,"SCOTT");
		  pst1.setString(3,"ANALYST");
		  
		  pst1.setString(2, "SCOTT'--");
		  
		  ResultSet rs=pst1.executeQuery(); //0
		  
		   while(rs.next()) {
					int eno=rs.getInt("empno");
					String ename=rs.getString("ename");
					String job=rs.getString("job");
					int sal=rs.getInt("sal");
				
					System.out.println("Employee Number: "+eno);
					System.out.println("Employee Name: "+ename);
					System.out.println("Employee Job: "+job);
					System.out.println("Employee Salary: "+sal);
					System.out.println("\n");
				}
		   
		 //DML operations
		  /* PreparedStatement pst2 = con.prepareStatement("insert into dept(DEPTNO, DNAME, LOC)values(?,?,?)");
		   pst2.setInt(1, 60);
		   pst2.setString(2,"IT");
		   pst2.setString(3,"Hyderabad");
		   
			int res=pst2.executeUpdate();
			
			if(res>0){
				System.out.println("record inserted");
			}else {
				System.out.println("record not inserted");
			}*/
		    
		    /* PreparedStatement pst3 = con.prepareStatement("update dept set loc=? , dname=? where deptno=?");//update dept set loc='Chennai',dname='sales' where deptno=10
		     pst3.setString(1,"Chennai");
		     pst3.setString(2, "Sales");
		     pst3.setInt(3,10);
		     
		     int res=pst3.executeUpdate();
		     if(res>0){
				System.out.println("record updated");
			   }else {
				System.out.println("record not updated");
			  }*/
		   /*PreparedStatement pst4 = con.prepareStatement("delete from dept where deptno=?");//delete from dept where deptno=60
		   pst4.setInt(1,60);
	        
			int res=pst4.executeUpdate();
			
			if(res>0){
				System.out.println("record deleted");
			}else {
				System.out.println("record not deleted");
			}*/
			
			
			pst1.close();
			con.close();
	}

}
