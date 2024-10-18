package com.jdbc.emp.presentation;
import java.sql.SQLException;
import java.util.Scanner;
public class EmpApplication {
public static void main(String[] args) 
{
	EmpUserImpl emp = new EmpUserImpl();
	Scanner scan = new Scanner(System.in);
	 int choice = 0;
     
     while(choice!=6)
     {
    	 System.out.println("\n------------------------------");
    	 System.out.println("Select Any Operation ");
    	 System.out.println("\n------------------------------");
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
