package com.sheoanna;
public final class App {
    private App() {
    }
    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("                          ");
        System.out.println("Welcome to BMI calculator!");
        System.out.println("--------------------------");
        System.out.println("                          ");

        BmiView view = new BmiView();
        Person defaultPerson = new Person(0, 0);
        BmiModel model = new BmiModel(defaultPerson);
        BmiController controller = new BmiController(model, view);

        controller.start();
    }
}
