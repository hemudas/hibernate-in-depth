package in.hid.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.hid.app.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer>{

}
