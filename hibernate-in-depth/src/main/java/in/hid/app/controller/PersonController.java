package in.hid.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.hid.app.entity.Person;
import in.hid.app.iservice.IPersonService;

@RestController
@RequestMapping("person")
public class PersonController {
	
	@Autowired
	private IPersonService personService;
	
	@GetMapping("")
	public ResponseEntity<?> getAllPerson(){
		return new ResponseEntity<>(personService.getAllPerson(), HttpStatus.OK);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<?> findPersonById(@PathVariable(name="id") Integer id){
		return new ResponseEntity<>(personService.findPersonById(id), HttpStatus.OK);
	}
	@DeleteMapping("{id}")
	public ResponseEntity<?> deletePersonById(@PathVariable(name="id") Integer id){
		return new ResponseEntity<>(personService.findPersonById(id), HttpStatus.NOT_FOUND);
	}
	@PostMapping("")
	public ResponseEntity<?> savePerson(@RequestBody Person person){
		return new ResponseEntity<>(personService.savePerson(person), HttpStatus.OK);
	}
}
