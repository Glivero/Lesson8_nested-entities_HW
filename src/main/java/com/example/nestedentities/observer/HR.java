package com.example.nestedentities.observer;

import java.util.ArrayList;
import java.util.List;

public class HR {

    List<Observer> list = new ArrayList<>();

    public void register(Observer observer){
        list.add(observer);
    }

    public void notify(Event event){

        for (Observer observer : list) {
            observer.handleEvent(event);
        }
    }
}
