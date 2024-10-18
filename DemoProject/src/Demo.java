import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {
public static void main(String[] args) {
	
	try {
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  System.out.println("Driver Loaded");
		  
		  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","Shivani369$");
		  System.out.println("connection established");
		  
		  String sql = "create table emp1 (empNo int,ename varchar(10),dept varchar(10),salary int)";
		  Statement statement = conn.createStatement();
		  //statement.executeUpdate("create table emp1 (empNo int,ename varchar(10),dept varcahr(10),salary int");
		  statement.executeUpdate(sql);
		  System.out.println("table created");
		  
		}
		catch(ClassNotFoundException e) {
			System.out.println(e);
		}
		catch(SQLException e) {
			System.out.println(e);
		}
	  	
}
}
