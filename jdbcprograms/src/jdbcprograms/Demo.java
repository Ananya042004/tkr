package jdbcprograms;
import java.sql.*;
public class Demo {
	

	public static void main(String[] args) throws Exception {
		
		String URL="jdbc:mysql://localhost:3306/tkr";
		String USER="root";
		String PASSWORD="root";
		
		//step1:load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("the driver is loaded succesfully");
		
		//step-2:establishing of an connection
		Connection con=DriverManager.getConnection(URL,USER,PASSWORD);
		System.out.println("connection established");
		
		//step-3:statement creation
		Statement st=con.createStatement();
		
		//step-4:execute a query
		st.executeUpdate("CREATE TABLE student(sid int,sname varchar(20))");
		System.out.println("table created");
		
		st.close();
		con.close();
	}

}
