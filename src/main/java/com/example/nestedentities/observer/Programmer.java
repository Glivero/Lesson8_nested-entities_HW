package com.example.nestedentities.observer;

public class Programmer implements Observer {
    @Override
    public void handleEvent(Event event) {

        switch (event) {
            case SALARY:
                System.out.println("ИДЕМ В БАР!");
                break;
            case FIRE_ALARM:
                System.out.println("RUN!!!!");
                break;
            case BIRTHDAY:
                System.out.println("FREE PIZZA!!!");
                break;
        }
    }
}