package training.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeImpl implements Employee {

	@Override
	public EmployeeDto getEmployeeById(int empId) {//7788
		
		EmployeeDto emp=null;
		
		Connection con=null;
		PreparedStatement pst=null;
		try {
			//DriverManager.registerDriver(new org.postgresql.Driver());
			Class.forName("org.postgresql.Driver"); 
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres", "postgres123$");
			System.out.println("Connected to PostgreSQL database!\n");
			
			
			//DRL operations
			 pst = con.prepareStatement("select * from emp where empno=?");//select * from emp where empno=7788
			 pst.setInt(1, empId);//788
			 
			ResultSet rs=pst.executeQuery();
			
			while(rs.next()) {
				  //emp=new EmployeeDto(rs.getInt("empno"),rs.getString("ename"),rs.getString("job"),rs.getInt("mgr"),rs.getDate("hiredate"),rs.getDouble("sal"),rs.getDouble("comm"),rs.getInt("deptno"));
				 
				 emp=new EmployeeDto();
				 emp.setEmpno(rs.getInt("empno"));
				 emp.setEname(rs.getString("ename"));
				 emp.setJob(rs.getString("job"));
				 emp.setSal(rs.getInt("sal"));
				 emp.setHiredate(rs.getDate("hiredate"));
				
			}
		
			//pst.close();
			//con.close();
		 }catch(ClassNotFoundException | SQLException ex){
			ex.printStackTrace();
		
		 }
		
		finally {
			try {
				pst.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		    
		}
		return emp;
	}

	@Override
	public List<EmployeeDto> getAllEmployees()  {
		List<EmployeeDto> empList=new ArrayList<>();
		
		EmployeeDto emp=null;
		
		Connection con=null;
		PreparedStatement pst=null;
		try {
			//DriverManager.registerDriver(new org.postgresql.Driver());
			Class.forName("org.postgresql.Driver"); 
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres", "postgres123$");
			System.out.println("Connected to PostgreSQL database!\n");
			
			
			//DRL operations
			 pst = con.prepareStatement("select * from emp");
			ResultSet rs=pst.executeQuery();
			
			while(rs.next()) {
				 emp=new EmployeeDto(rs.getInt("empno"),rs.getString("ename"),rs.getString("job"),rs.getInt("mgr"),rs.getDate("hiredate"),rs.getDouble("sal"),rs.getDouble("comm"),rs.getInt("deptno"));
				 
				/* emp=new EmployeeDto();
				 emp.setEmpno(rs.getInt("empno"));
				 emp.setEname(rs.getString("ename"));
				 emp.setJob(rs.getString("job"));
				 emp.setSal(rs.getInt("sal"));
				 emp.setHiredate(rs.getDate("hiredate")); */
				 
				 empList.add(emp);
			}
		
		 }catch(ClassNotFoundException|SQLException ex){
			ex.printStackTrace();
		
		 }
		
		finally {
			try {
				pst.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		    
		}
		
		return empList;
	}

}
