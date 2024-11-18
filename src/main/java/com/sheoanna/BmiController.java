package com.sheoanna;

public class BmiController {
    BmiModel model;
    BmiView view;

    public BmiController(BmiModel model, BmiView view) {
        this.model = model;
        this.view = view;
    }

    public void start() {
        double weight = view.askWeight();
        double height = view.askHeight();

        Person person = new Person(weight, height);
        model = new BmiModel(person);

        double bmi = model.calculateBMI();

        String classification = model.giveResultsBMI(bmi);

        view.showResults(bmi, classification);
    } 
}
