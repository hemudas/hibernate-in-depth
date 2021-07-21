package in.hid.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.hid.app.entity.Person;
import in.hid.app.iservice.IPersonService;
import in.hid.app.repository.PersonRepository;

@Service("personService")
public class PersonService implements IPersonService{

	@Autowired
	private PersonRepository personRepository; 
	
	@Override
	public List<Person> getAllPerson() {
		return personRepository.findAll();
	}

	@Override
	public Person getPersonById(Integer id) {
		return personRepository.findById(id).get();
	}

}
