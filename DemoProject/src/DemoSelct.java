import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoSelct {
	
	public static void main(String[] args)throws ClassNotFoundException,SQLException {
		 
	 
		 Class.forName("com.mysql.cj.jdbc.Driver"); 
		  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","Shivani369$");
		 
		  String sql = "select * from emp1 where dept = 'sales'";
		  Statement statement = conn.createStatement();
		  ResultSet rs = statement.executeQuery(sql);
		  
		  System.out.println("EmpNo\tName\tDept\tSalary");
		  while(rs.next()) {
			  System.out.print(rs.getInt(1)+ "\t");
			  System.out.print(rs.getString(2)+"\t");
			  System.out.print(rs.getString(3)+"\t");
			  System.out.print(rs.getInt(4)+"\t");
		  }
	}

}
