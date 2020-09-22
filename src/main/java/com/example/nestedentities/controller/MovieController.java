package com.example.nestedentities.controller;

import com.example.nestedentities.model.Movie;
import com.example.nestedentities.repository.MovieRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

    MovieRepository movieRepository;

    public MovieController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @GetMapping("/movie")
    public List<Movie> getAll() {

        List<Movie> all = movieRepository.findAll();
        return all;
    }
}
