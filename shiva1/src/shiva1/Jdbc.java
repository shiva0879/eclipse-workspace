package shiva1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
     System.out.println("driver is loadded....");
     Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","shiva","shiva0879");
     System.out.println("connection created succesfully.."+connection);
     Statement statement=connection.createStatement();
     int a=statement.executeUpdate("create table emp(empid number,empname varchar2(22),empsal number)");
     System.out.println("table created succesfully..."+a);
     //insert values 
      int x1= statement.executeUpdate("insert into emp values(001,'shiva',1000)");
      int x2= statement.executeUpdate("insert into emp values(002,'ratan',2000)");
      int x3= statement.executeUpdate("insert into emp values(003,'kumar',3000)");
      System.out.println("input values"+x1+" "+x2+" "+x3);
     
      int count=statement.executeUpdate("update emp set empsal = empsal+500 where empsal>1000");
      System.out.println("update emp"+ count);
      int delcount =statement.executeUpdate("delete from emp where empsal<1500");
      System.out.println("delete is "+delcount); 
      int drop = statement.executeUpdate("drop table emp");
      System.out.println("drop"+drop);
      
      connection.close();
      System.out.println("connection closed ");
	}
	

}
