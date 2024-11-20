package com.sheoanna;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BmiModelTest {
    
    
    @Test
    void testCalculateBMI() {
        Person person = new Person(60, 1.70);
        BmiModel bmi = new BmiModel(person);
        double result = bmi.calculateBMI();
        assertEquals(20.76, result, 0.01);
    }

    @Test
    void testGiveResultsBMI() {
        assertThat(new BmiModel(new Person(50, 1.80)).giveResultsBMI(15.43), equalTo("Severe thinness"));
        assertThat(new BmiModel(new Person(52.0, 1.80)).giveResultsBMI(16.05), equalTo("Moderate thinness"));
        assertThat(new BmiModel(new Person(57.0, 1.80)).giveResultsBMI(17.59), equalTo("Mild thinness"));
        assertThat(new BmiModel(new Person(60.0, 1.70)).giveResultsBMI(20.76), equalTo("Normal weight"));
        assertThat(new BmiModel(new Person(85.0, 1.80)).giveResultsBMI(26.23), equalTo("Overweight"));
        assertThat(new BmiModel(new Person(100.0, 1.80)).giveResultsBMI(30.86), equalTo("Mild obesity"));
        assertThat(new BmiModel(new Person(115.0, 1.80)).giveResultsBMI(35.49), equalTo("Moderate obesity")); 
        assertThat(new BmiModel(new Person(120.0, 1.60)).giveResultsBMI(46.875), equalTo("Morbid Obesity"));

    }
}
