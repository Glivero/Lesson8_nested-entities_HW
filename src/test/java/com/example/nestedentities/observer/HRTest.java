package com.example.nestedentities.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HRTest {

    @Test
    void testNotify() {
        Director director = new Director();
        Programmer dev1 = new Programmer();
        Programmer dev2 = new Programmer();

        HR hr = new HR();
        hr.register(director);
        hr.register(dev1);
        hr.register(dev2);

        hr.notify(Event.FIRE_ALARM);
        hr.notify(Event.SALARY);
        hr.notify(Event.BIRTHDAY);
        hr.notify(Event.FIRE_ALARM);
    }
}