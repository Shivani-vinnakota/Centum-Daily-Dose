import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DemoInsert {
    
	int empNo,salary;
	String eName,dept;
	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		DemoInsert d = new DemoInsert();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter emp No:");
		d.empNo = scan.nextInt();
		System.out.println("Enter emp Name:");
		d.eName = scan.next();
		System.out.println("Enter dept:");
		d.dept = scan.next();
		System.out.println("Enter salary:");
		d.salary = scan.nextInt();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","Shivani369$");
		
		String sql = "insert into emp1 values ("+d.empNo+",'"+d.eName+"','"+d.dept+"','"+d.salary+"')";
		Statement statement = conn.createStatement();
		statement.executeUpdate(sql);
		System.out.println("Record Added");
		
	}
}
