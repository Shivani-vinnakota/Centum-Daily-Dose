import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DemoInsert2 {
	int empNo,salary;
	String eName,dept;
	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		
		DemoInsert2 d = new DemoInsert2();
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
		
		String sql = "insert into emp1 values( ?,?,?,?)";
	    PreparedStatement pst = conn.prepareStatement(sql);
	    pst.setInt(1, d.empNo);
	    pst.setString(2, d.eName);
	    pst.setString(3, d.dept);
	    pst.setInt(4,d.salary);
	    pst.executeUpdate();
	    System.out.println("Record Added");
	  
	}
	
}
