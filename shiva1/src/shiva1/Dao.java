package shiva1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Dao {
	public void savePerson(person person) throws SQLException {
	  Connection connection=Testconnection.creatConnection();
	  PreparedStatement preparedStatement=connection.prepareStatement("insert into person values(?,?,?,?,?)");
	  preparedStatement.setInt(1,person.getid());
	  preparedStatement.setString(2,person.getfname());
	  preparedStatement.setString(3,person.getlname());
	  preparedStatement.setString(4,person.getemailid());
	  preparedStatement.setLong(5,person.getphnumber());
	  preparedStatement.executeUpdate();
	  System.out.println("data inserted succesfully...");
	  
	  
	}

	public person getpersonbyid(int id) throws SQLException {
		Connection connection=Testconnection.creatConnection();
		Statement statement=connection.createStatement();
		ResultSet set=statement.executeQuery("select * from person where id="+id);
		set.next();
		
		person person=new person(set.getInt(1), set.getString(2),set.getString(3),set.getString(4),set.getLong(5));
				
		
		
		return person;
	}

	public List<person> getpersonbyfname(String fname) throws SQLException {
		Connection connection=Testconnection.creatConnection();
		Statement statement =connection.createStatement();
		ResultSet set=statement.executeQuery("select * from person where fname='"+fname+"'");
			
		List<person>  persons=new ArrayList<person>();{
			while(set.next()) {
				person person=new person(set.getInt(1), set.getString(2),set.getString(3),set.getString(4),set.getLong(5));
				
			persons.add(person);
		}
			return persons;
		}
		
		
	}

	public void deleteById(int id) throws SQLException {
		// TODO Auto-generated method stub
		Connection connection = Testconnection.creatConnection();
		Statement statement = connection.createStatement();
		int count = statement.executeUpdate("delete from person where id ="+id);
		System.out.println("Data deleted sucessfully"+count);
		
	}

	public void updateByFirstName(String fname) throws SQLException {
		// TODO Auto-generated method stub
		Connection connection = Testconnection.creatConnection();
		Statement statement = connection.createStatement();
		int count = statement.executeUpdate("update person set fname=' siva' where fname = '"+fname+"'");	
		System.out.println("data updated sucesssfully"+ " "+ count);
		
	}

}
