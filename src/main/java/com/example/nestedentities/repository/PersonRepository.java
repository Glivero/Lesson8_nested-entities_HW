package com.example.nestedentities.repository;

import com.example.nestedentities.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

    Person findPersonByPassportNumber(String number);

}
