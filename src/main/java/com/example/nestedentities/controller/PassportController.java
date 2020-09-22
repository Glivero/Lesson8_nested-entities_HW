package com.example.nestedentities.controller;

import com.example.nestedentities.model.Passport;
import com.example.nestedentities.repository.PassportRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PassportController {

    PassportRepository passportRepository;

    public PassportController(PassportRepository passportRepository) {
        this.passportRepository = passportRepository;
    }

    @GetMapping("/passport")
    public List<Passport> getAll() {

        List<Passport> all = passportRepository.findAll();
        return all;
    }
}
