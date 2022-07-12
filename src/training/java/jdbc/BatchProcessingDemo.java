package training.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchProcessingDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//DriverManager.registerDriver(new org.postgresql.Driver());
		 Class.forName("org.postgresql.Driver"); 
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres", "postgres123$");
		System.out.println("Connected to PostgreSQL database!\n");
		
		Statement st = con.createStatement();
		con.setAutoCommit(false);
		st.addBatch("insert into dept(deptno,dname,loc)values(60, 'Engineer', 'India');");
		st.addBatch("insert into dept(deptno,dname,loc)values(80, 'IT', 'England');");
		st.addBatch("insert into dept(deptno,dname,loc)values(90, 'Sales', 'AUS');");
		st.addBatch("update dept set dname='Sales' where deptno=60 ");
		st.addBatch("delete from  dept where deptno=90 ");
		
        st.executeBatch();
        System.out.println("Batch executed sucessfully");
        
        con.commit();
        con.close();
        st.close();
	}

}
