package com.example.nestedentities.repository;

import com.example.nestedentities.model.Drink;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DrinkRepository extends JpaRepository<Drink, Long> {
}
