package com.sheoanna;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonTest {
    private double weight;
    private double height;
    private Person person;

    @BeforeEach 
    void seyUp() {
        weight = 50;
        height = 1.6;
        person = new Person(weight, height);
    }

    @Test
    void testGetHeight() {
        assertEquals(1.6, person.getHeight());
    }

    @Test
    void testGetWeight() {
        assertEquals(50, person.getWeight());
    }

    @Test
    void testSetHeight() {
        person.setHeight(1.64);
        assertEquals(1.64, person.getHeight());
    }

    @Test
    void testSetWeight() {
        person.setWeight(52.5);
        assertEquals(52.5, person.getWeight());
    }
}
