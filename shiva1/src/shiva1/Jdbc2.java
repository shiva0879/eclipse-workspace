package shiva1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Jdbc2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
	     System.out.println("driver is loadded....");
	     Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","shiva","shiva0879");
	     System.out.println("connection created succesfully.."+connection);
	     String sql="insert into emp values(?,?,?)";
         PreparedStatement ps = connection.prepareStatement(sql);
while(true) {
	    	 
	     
         Scanner sc= new Scanner(System.in);	
         System.out.println("enter a id");
         int id =sc.nextInt();
         System.out.println("enter a ename");
         String ename=sc.next();
         System.out.println("enter a empsalary");
         double empsalary=sc.nextDouble();
         
         
         ps.setInt(1, id);
         ps.setString(2, ename);
         ps.setDouble(3, empsalary);
         
         int x1=ps.executeUpdate();
         System.out.println("inserted row count"+x1+" "+"enter a value yes or no");
        
        String option=sc.next();
        if(option.equals("no")) {
        	break;
        }
        sc.close();
	     }
         
         
	}

}
