package training.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.postgresql.ds.PGSimpleDataSource;

public class StatementDemo {

	public static void main(String[] args) {
		    Connection con=null;
		    Statement st=null;
		
			try {
				Class.forName("org.postgresql.Driver");
				con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres123$");
				
				/*PGSimpleDataSource ds=new PGSimpleDataSource();
				ds.setURL("jdbc:postgresql://localhost:5432/postgres");
				ds.setUser("postgres");
				ds.setPassword("postgres123$");
				
				con=ds.getConnection();*/
				
				System.out.println("Connected to PostgreSQL database!\n");

			     st = con.createStatement();
			    
			 // DRL operations
			     ResultSet rs = st.executeQuery("select * from emp where empno=7788 and ename='SCOTT' "); //100 requests
			     
			    // ResultSet rs = st.executeQuery("select * from emp where empno=7788 and ename='SCOTT'--' "); //SQLInjection
			     
			     
				while (rs.next()) {
					// retrieved based on column names 
					/*int eno=rs.getInt("empno"); 
					String ename = rs.getString("ename");
					String job = rs.getString("job");
					double sal = rs.getDouble("sal");*/

					// retrieved based on column numbers 
					int eno=rs.getInt(1);
					String ename = rs.getString(2);
					String job = rs.getString(3);
					double sal = rs.getDouble(6);
					int deptno = rs.getInt(8);

					System.out.println("Employee Number: " + eno);
					System.out.println("Employee Name: " + ename);
					System.out.println("Employee Job: " + job);
					System.out.println("Employee Salary: " + sal);
					System.out.println("\n");
				}

				// DML operations //
			    /* int res=st.executeUpdate("insert into DEPT(DEPTNO, DNAME, LOC)values(80, 'IT', 'Canada')");
			     if (res > 0) {
					System.out.println("record inserted");
				} else {
					System.out.println("record not inserted");
				}
			       int res = st.executeUpdate("update dept set loc='Vizag',dname='test123' where deptno=50");
				if (res > 0) {
					System.out.println("record updated");
				} else {
					System.out.println("record not updated");
				}
				
				 int res = st.executeUpdate("delete from dept where deptno=80");
				if (res > 0) {
					System.out.println("record deleted");
				} else {
					System.out.println("record not deleted");
				}*/
			    
			} catch (ClassNotFoundException | SQLException  e) {
				e.printStackTrace();
			}
			
			finally {
				try {
					con.close();
					st.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
				
			}

		
	}

}
