package in.hid.app.iservice;

import java.util.List;

import in.hid.app.entity.Person;

public interface IPersonService {
	
	public List<Person> getAllPerson();
	public Person findPersonById(Integer id);
	public void deletePersonById(Integer id);
	public Person savePerson(Person person);
	
}
