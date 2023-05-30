package shiva1;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class Jdbc3 {

	public static void main(String[] args) {
		Connection connection=null;
		Statement statement=null;
		ResultSet set=null;
	
      try {
    	  
    	  Properties properties =new Properties();
    	  properties.load( new FileInputStream("connection.properties"));{
    	  
    	  Class.forName(properties.getProperty("driver"));
    	  connection=DriverManager.getConnection(properties.getProperty("url"),
    	  properties.getProperty("username"),
    	  properties.getProperty("password"));
    	  statement =connection.createStatement();
    	  set= statement.executeQuery("select * from person");
    	  while (set.next()) {
			System.out.println(set.getInt(1)+" "+ set.getString(2)+" "+set.getString(3)+" "+set.getString(4)+" "+set.getLong(5));
			
		}
    	  
    	  }
	} catch (Exception e) {
		e.printStackTrace();
	
	}
      finally {
		try {
			if(set!=null)set.close();
			if(statement!=null)statement.close();
			if(connection!=null)connection.close();
			
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}

		
		
		

	}

}
