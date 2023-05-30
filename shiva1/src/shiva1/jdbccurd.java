package shiva1;

import java.sql.SQLException;
import java.util.List;

public class jdbccurd {

	public static void main(String[] args) throws SQLException {
		
		person person= new person(111,"shiva","kumar","shiva@gmail.com",887766554);
        
		Dao dao=new Dao();
		dao.savePerson(person);
		
		person p=dao.getpersonbyid(111);
		System.out.println(p);
		
		
		List<person> persons=dao.getpersonbyfname("raj");
		persons.forEach(per->System.out.println(per));
		
		dao.deleteById(125);
		dao.updateByFirstName("ninnu");
	
		
	}

}
