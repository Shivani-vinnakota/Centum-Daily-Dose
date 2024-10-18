import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner; 
import java.sql.Connection;


public class EmployeeApplication {
	static Scanner scan = new Scanner(System.in);	
	int empNo,Salary;
	String eName,dept,sql;
	Connection conn;
	PreparedStatement pst;
	ResultSet rs;
	
	public EmployeeApplication() 
	{
		 conn = MyConnection.getConnection();
	}
	
	void insertRecord() throws SQLException 
	{
		 System.out.println("Enter emp No:");
		 empNo = scan.nextInt();
		 System.out.println("Enter emp Name:");
	     eName = scan.next();
		 System.out.println("Enter dept:");
		 dept = scan.next();
		 System.out.println("Enter salary:");
		 Salary = scan.nextInt();
		
	    sql = "insert into emp1 values( ?,?,?,?)";
	    pst = conn.prepareStatement(sql);
	    pst.setInt(1, empNo);
	    pst.setString(2, eName);
	    pst.setString(3, dept);
	    pst.setInt(4, Salary);
	    pst.executeUpdate();
	    System.out.println("Record Added");
	      
	}
	void deleteRecord()throws SQLException 
	{
		     System.out.println("Enter emp No:");
	         empNo = scan.nextInt(); 
		
			 sql = "delete from emp1 where empNo = ?";
			 pst = conn.prepareStatement(sql);
		     pst.setInt(1, empNo);
		     pst.executeUpdate();
		     System.out.println("Record Deleted");
		     
	}
	void updateRecord()throws  SQLException 
	{
		System.out.println("Enter emp No : ");
		empNo = scan.nextInt();
		System.out.println("Enter Salary: ");
		Salary = scan.nextInt();
		
		
		 sql = "update emp1 set salary =?  where empNo= ?";
		 pst = conn.prepareStatement(sql);
		 pst.setInt(2, empNo);
		 pst.setInt(1,Salary);
		 pst.executeUpdate();
		System.out.println("Record Updated");
		
	}
	void findRecordByEmpId()throws  SQLException 
	{
		  System.out.println("Enter emp No : ");
		  empNo = scan.nextInt();
		  
		  
		   sql = "select * from emp1 where empNo = ? ";
		   pst = conn.prepareStatement(sql);
		   pst.setInt(1,empNo);
		   rs = pst.executeQuery();
		  
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
		  
	}
	void findAllRecords()throws  SQLException
	{
		  
		   sql = "select * from emp1";
		  Statement statement = conn.createStatement();
		   rs = statement.executeQuery(sql);
		  
		  System.out.println("EmpNo\tName\tDept\tSalary");
		  while(rs.next()) {
			  System.out.print(rs.getInt(1)+ "\t");
			  System.out.print(rs.getString(2)+"\t");
			  System.out.print(rs.getString(3)+"\t");
			  System.out.print(rs.getInt(4)+"\t");
		  }	 
		  
	}
	
public static void main(String[] args) 
{
      EmployeeApplication emp = new EmployeeApplication();
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
        	 
        	 catch(SQLException e)
        	 {
        		System.out.println(e); 
        	 }
         }	
}	
}

