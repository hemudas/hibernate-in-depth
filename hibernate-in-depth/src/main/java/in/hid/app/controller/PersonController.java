package in.hid.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	public ResponseEntity<?> getPersonById(@PathVariable(name="id") Integer id){
		return new ResponseEntity<>(personService.getPersonById(id), HttpStatus.OK);
	}
	
}
