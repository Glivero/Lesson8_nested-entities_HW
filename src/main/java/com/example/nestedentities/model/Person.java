package com.example.nestedentities.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class Person {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany
    @JsonManagedReference
    private List<Passport> passport;


    @ManyToMany
    @JsonIgnoreProperties("watchers")
    private List<Movie> movies;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Passport> getPassport() {
        return passport;
    }

    public void setPassport(List<Passport> passport) {
        this.passport = passport;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }
}
