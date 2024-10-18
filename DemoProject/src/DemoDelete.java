import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DemoDelete {
 int empNo;
   public static void main(String[] args) throws ClassNotFoundException,SQLException{
	 DemoDelete d = new DemoDelete();
	 Scanner scan = new Scanner(System.in);
		
	 System.out.println("Enter emp No:");
     d.empNo = scan.nextInt();
     
     Class.forName("com.mysql.cj.jdbc.Driver");
	 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","Shivani369$");
	
	 String sql = "delete from emp1 where empNo = ?";
	 PreparedStatement pst = conn.prepareStatement(sql);
     pst.setInt(1, d.empNo);
     pst.executeUpdate();
     System.out.println("Record Deleted");
}
}
