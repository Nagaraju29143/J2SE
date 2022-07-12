package training.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcPostgreSqlConnectDemo {

	public static void main(String[] args) throws SQLException, ClassNotFoundException{
		
		//DriverManager.registerDriver(new org.postgresql.Driver());//Explicit Registration
		Class.forName("org.postgresql.Driver"); //Implicit Registration
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres", "postgres123$");
		System.out.println("Connected to PostgreSQL database!");
		
		Statement st=con.createStatement();
		
		/* int res=st.executeUpdate("insert into DEPT(DEPTNO, DNAME, LOC)values(50, 'IT', 'Canada')");
	     if (res > 0) {
			System.out.println("record inserted");
		} else {
			System.out.println("record not inserted");
		}*/
	    
		 /*int res = st.executeUpdate("update dept set loc='Vizag',dname='test123' where deptno=50");
			if (res > 0) {
				System.out.println("record updated");
			} else {
				System.out.println("record not updated");
			}*/
		
		 /*int res = st.executeUpdate("delete from dept where deptno=80");
			if (res > 0) {
				System.out.println("record deleted");
			} else {
				System.out.println("record not deleted");
			}*/
		
		//ResultSet rs = st.executeQuery(" select * from emp where empno=7788 and ename='SCOTT' "); // 1 record
		
		ResultSet rs = st.executeQuery("select * from emp where empno=7788 and ename='SCOTT'--' "); //should return 0 record but returns 1 record//Sql Injection
		
		while (rs.next()) {
			// retrieved based on column names 
			int eno=rs.getInt("empno"); 
			String ename = rs.getString("ename");
			String job = rs.getString("job");
			double sal = rs.getDouble("sal");
			
			System.out.println("Employee Number: " + eno);
			System.out.println("Employee Name: " + ename);
			System.out.println("Employee Job: " + job);
			System.out.println("Employee Salary: " + sal);
			System.out.println("\n");
		}
		
	     con.close();
	}

}
