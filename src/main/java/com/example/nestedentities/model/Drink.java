package com.example.nestedentities.model;

import javax.persistence.*;


@Entity
@Table(name = "DRINK")
public class Drink {

    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "NUMBER")
    private String number;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
