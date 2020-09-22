package com.example.nestedentities.controller;

import com.example.nestedentities.model.Movie;
import com.example.nestedentities.model.Passport;
import com.example.nestedentities.model.Person;
import com.example.nestedentities.repository.MovieRepository;
import com.example.nestedentities.repository.PassportRepository;
import com.example.nestedentities.repository.PersonRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    private PersonRepository personRepository;
    private PassportRepository passportRepository;
    private MovieRepository movieRepository;

    public PersonController(PersonRepository personRepository, PassportRepository passportRepository, MovieRepository movieRepository) {
        this.personRepository = personRepository;
        this.passportRepository = passportRepository;
        this.movieRepository = movieRepository;
    }

    @GetMapping("/person")
    public List<Person> getAll() {

        return personRepository.findAll();
    }

    @GetMapping("/person/passport/{passportId}")
    public Person getByPassport(@PathVariable String passportId) {

        return personRepository.findPersonByPassportNumber(passportId);
    }

    @GetMapping("/generate")
    public Person generateData(){

        Person person = new Person();
        person.setName("Vlad");

        Movie titanic = new Movie();
        titanic.setTitle("Titanic");

        Movie inception = new Movie();
        inception.setTitle("Inception");

        movieRepository.save(titanic);
        movieRepository.save(inception);

//        titanic.setWatchers(List.of(person));
//        inception.setWatchers(List.of(person));
//
//        person.setMovies(List.of(titanic, inception));

        return personRepository.save(person);
    }
}
