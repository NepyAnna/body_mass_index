package com.sheoanna;

import java.util.Scanner;

public class BmiView {

    private Scanner scanner = new Scanner(System.in);

    
    public double askWeight(){
        System.out.println("Enter your weight in kilograms ");
        return scanner.nextDouble();
    }

    public double askHeight(){
        System.out.println("----------------------------");
        System.out.println("Enter your height in meters ");
        return scanner.nextDouble();
    }
    
    public void showResults(double bmi, String clasification){
        //Devuelve el valor del bmi calculado
        System.out.printf("Your BMI is: %.2f\n\n", bmi);

        //Devolver el rango/la clasificación en la tabla del BMI
        System.out.println("Your BMI is: " + clasification);
    }
}
