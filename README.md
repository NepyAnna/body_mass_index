# BMI Calculator

This project is a BMI (Body Mass Index) calculator implemented in Java using the MVC (Model-View-Controller) design pattern. It includes unit tests written with JUnit 5 and uses Mockito for mocking dependencies.

# Technologies Used

Java: Programming language
JUnit 5: Unit testing framework
Mockito: Library for mocking objects
Hamcrest: Assertions library for readable test conditions

# Installation

Prerequisites

- Java Development Kit (JDK): Ensure JDK 8 or later is installed.
Download JDK
- Build Tool: Install Maven (or use your IDE’s built-in support).
- IDE (Optional): Use an Integrated Development Environment like IntelliJ IDEA, Eclipse, or VS Code for easier development.

Steps to Install

1. Clone the Repository:
git clone https://github.com/NepyAnna/body_mass_index.git
2. Open the Project
Open the project folder in your preferred IDE, or navigate to the folder in a terminal.
3. Run the Tests
Run the test files individually from your IDE.

'''mermaid
graph TD
    Start[“Start”] --> InitializationByDefault["Initialization by default"]
    InitializationByDefault --> StartController["Start Controller"]
    StartController --> GettingInput["Ask weight, Ask Height"]
    GettingInput --> SetPerson["Set Person instance with Inputs"]
    SetPerson --> SetBmiModel["Set BmiModel"]
    SetBmiModel --> CalculateBMI["Calculate BMI"]
    CalculateBMI --> ClassifyBMI["Classify BMI result"]

