package com.example.nestedentities.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Movie {

    @Id
    @GeneratedValue
    Long id;

    String title;

    @ManyToMany
    @JsonIgnoreProperties("movies")
    List<Person> watchers;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Person> getWatchers() {
        return watchers;
    }

    public void setWatchers(List<Person> watchers) {
        this.watchers = watchers;
    }
}
