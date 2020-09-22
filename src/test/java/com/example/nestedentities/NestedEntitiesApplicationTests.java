package com.example.nestedentities;

import com.example.nestedentities.model.Drink;
import com.example.nestedentities.repository.DrinkRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

@Sql(scripts = "classpath:data.sql")
@SpringBootTest
class NestedEntitiesApplicationTests {

    @Autowired
    DrinkRepository drinkRepository;


    @Test
    void contextLoads() {
        List<Drink> all = drinkRepository.findAll();
        Assertions.assertThat(all).size().isEqualTo(1);
    }


}
