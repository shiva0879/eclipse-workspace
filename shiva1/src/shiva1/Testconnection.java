package shiva1;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class Testconnection {
	public static Connection creatConnection() {
		Connection connection= null	;
		try {
			Properties properties=new Properties();
			properties.load(new FileInputStream("connection.properties")); {
			 
				Class.forName(properties.getProperty("driver"));
				connection=DriverManager.getConnection(properties.getProperty("url"),
						properties.getProperty("username"),
						properties.getProperty("password"));
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
		
	}

}
