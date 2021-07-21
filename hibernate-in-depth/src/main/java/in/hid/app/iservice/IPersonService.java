package in.hid.app.iservice;

import java.util.List;

import in.hid.app.entity.Person;

public interface IPersonService {
	
	public List<Person> getAllPerson();
	public Person getPersonById(Integer id);
	
}
