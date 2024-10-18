import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DemoUpdate {
	int empNo,salary;
	public static void main(String[] args)throws ClassNotFoundException,SQLException {
		
	DemoUpdate d = new DemoUpdate();
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter emp No : ");
	d.empNo = scan.nextInt();
	System.out.println("Enter Salary: ");
	d.salary = scan.nextInt();
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","Shivani369$");
	
	String sql = "update emp1 set salary = "+d.salary+" where empNo= "+d.empNo+" ";
	Statement statement = conn.createStatement();
	statement.executeUpdate(sql);
	System.out.println("Record Updated");
	}
}
