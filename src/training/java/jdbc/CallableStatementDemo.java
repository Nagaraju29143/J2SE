package training.java.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;

public class CallableStatementDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//DriverManager.registerDriver(new org.postgresql.Driver());
		 Class.forName("org.postgresql.Driver"); 
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres", "postgres123$");
		System.out.println("Connected to PostgreSQL database!\n");
		
		/*CallableStatement  cst=con.prepareCall("{ ?= call fn_getempcount()}");
		cst.registerOutParameter(1,Types.INTEGER);
		cst.execute();
		
		int count=cst.getInt(1);
		System.out.println("Total no of records: "+count);*/
		
		/*CallableStatement  cst=con.prepareCall("{ ? = call fn_getempdetails(?)}");
		cst.registerOutParameter(1,Types.VARCHAR);
		cst.setInt(2,7566);
		
		cst.execute();
		
		String job=cst.getString(1);
		System.out.println("Employee Job: "+job);*/
		
		CallableStatement  cst=con.prepareCall("{ ? = call fn_insert_dept(?,?,?)}");
		cst.registerOutParameter(1,Types.INTEGER);
		cst.setInt(2, 90);
		cst.setString(3, "test");
		cst.setString(4, "hyd");
		
		cst.execute();
		
		int res=cst.getInt(1);
		System.out.println(res);
		
		
		con.close();
		cst.close();
	}

}
