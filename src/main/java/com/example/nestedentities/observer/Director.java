package com.example.nestedentities.observer;

public class Director implements Observer {
    @Override
    public void handleEvent(Event event) {
        switch (event) {
            case SALARY:
                System.out.println("Я К ЖЕНЕ");
                break;
            case FIRE_ALARM:
                System.out.println("КОЛЛЕГИ, БЕЗ ПАНИКИ");
                break;
            case BIRTHDAY:
                System.out.println("ДОРОГИЕ КОЛЛЕГИ! КАК Я ВАС ЦЕНЮ!");
                break;
        }
    }
}
