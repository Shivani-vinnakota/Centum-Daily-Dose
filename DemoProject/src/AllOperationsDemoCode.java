import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;

public class AllOperationsDemoCode {
	static Scanner scan = new Scanner(System.in);	
	int empNo,Salary;
	String eName,dept;
	
	void insertRecord() throws ClassNotFoundException, SQLException 
	{
		 System.out.println("Enter emp No:");
		 empNo = scan.nextInt();
		 System.out.println("Enter emp Name:");
	     eName = scan.next();
		 System.out.println("Enter dept:");
		 dept = scan.next();
		 System.out.println("Enter salary:");
		 Salary = scan.nextInt();
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","Shivani369$");
		
		String sql = "insert into emp1 values( ?,?,?,?)";
	    PreparedStatement pst = conn.prepareStatement(sql);
	    pst.setInt(1, empNo);
	    pst.setString(2, eName);
	    pst.setString(3, dept);
	    pst.setInt(4, Salary);
	    pst.executeUpdate();
	    System.out.println("Record Added");
	    conn.close();  
	}
	void deleteRecord()throws ClassNotFoundException, SQLException 
	{
		   System.out.println("Enter emp No:");
	       empNo = scan.nextInt(); 
		
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","Shivani369$");
			
			 String sql = "delete from emp1 where empNo = ?";
			 PreparedStatement pst = conn.prepareStatement(sql);
		     pst.setInt(1, empNo);
		     pst.executeUpdate();
		     System.out.println("Record Deleted");
		     conn.close();
	}
	void updateRecord()throws ClassNotFoundException, SQLException 
	{
		System.out.println("Enter emp No : ");
		empNo = scan.nextInt();
		System.out.println("Enter Salary: ");
		Salary = scan.nextInt();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","Shivani369$");
		
		String sql = "update emp1 set salary = "+Salary+" where empNo= "+empNo+" ";
		Statement statement = conn.createStatement();
		statement.executeUpdate(sql);
		System.out.println("Record Updated");
		conn.close();
	}
	void findRecordByEmpId()throws ClassNotFoundException, SQLException 
	{
		  System.out.println("Enter emp No : ");
		  empNo = scan.nextInt();
		  
		  Class.forName("com.mysql.cj.jdbc.Driver"); 
		  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","Shivani369$");
		 
		  String sql = "select * from emp1 where empNo = ? ";
		  PreparedStatement statement = conn.prepareStatement(sql);
		 
		  statement.setInt(1,empNo);
		  ResultSet rs = statement.executeQuery();
		  
		  if(rs.next()) {
			  System.out.println("EmpNo\tName\tDept\tSalary");
			  System.out.print(rs.getInt(1)+ "\t");
			  System.out.print(rs.getString(2)+"\t");
			  System.out.print(rs.getString(3)+"\t");
			  System.out.print(rs.getInt(4)+"\t");
		  }
		  else
		  {
			  System.out.println("EmpId Not Exist");
		  }
		  conn.close();
	}
	void findAllRecords()throws ClassNotFoundException, SQLException
	{
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
		  conn.close();
	}
	
public static void main(String[] args)  {
      AllOperationsDemoCode emp = new  AllOperationsDemoCode();
         int choice = 0;
         
         while(choice!=6)
         {
        	 System.out.println("Select Any Option ");
        	 System.out.println("Press 1 for Add Record ");
        	 System.out.println("Press 2 for Delete Record ");
        	 System.out.println("Press 3 for Update Record ");
        	 System.out.println("Press 4 for Find Record By EmpId ");
        	 System.out.println("Press 5 for Find All Records ");
        	 System.out.println("Press 6 for Exit Application ");
        	 
        	 System.out.println("Enter Option : ");
        	 choice = scan.nextInt();
        	 
        	 try
        	 {
        		 switch(choice)
        		 {
        		 case 1 :emp.insertRecord();
        		          break;
        		 case 2 :emp.deleteRecord();
		                  break;
        		 case 3 :emp.updateRecord();
		                  break;
        		 case 4 :emp.findRecordByEmpId();
		                  break;
        		 case 5 :emp.findAllRecords();
		                  break;
        		 case 6 :System.out.println("User Quit Application");;
		                  System.exit(0);
		         default : System.out.println("Invalid Option.....Try Again....");
        		 }
        	 }
        	 catch(ClassNotFoundException e)
        	 {
        		System.out.println(e); 
        	 }
        	 catch(SQLException e)
        	 {
        		System.out.println(e); 
        	 }
         }
	
	
}	
}



