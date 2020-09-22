package com.example.nestedentities.repository;

import com.example.nestedentities.model.Passport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassportRepository extends JpaRepository<Passport, Long> {
}
