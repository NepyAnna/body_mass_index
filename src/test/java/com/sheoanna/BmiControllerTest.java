package com.sheoanna;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class BmiControllerTest {
    private BmiModel mockModel;
    private BmiView mockView;
    private BmiController controller;

    @BeforeEach
    void setUp() {
        // Create mock objects for dependencies
        mockModel = mock(BmiModel.class);
        mockView = mock(BmiView.class);
        // Initialize the controller with mock objects
        controller = new BmiController(mockModel, mockView);
    }

    @Test
    void testStart() {
        when(mockView.askWeight()).thenReturn(70.0); // Mock weight input
        when(mockView.askHeight()).thenReturn(1.75); // Mock height input

        // Create a real person object and calculate expected values
        Person mockPerson = new Person(70.0, 1.75);
        BmiModel realModel = new BmiModel(mockPerson);
        double expectedBmi = realModel.calculateBMI();
        String expectedClassification = realModel.giveResultsBMI(expectedBmi);

        // Mock model's behavior for BMI calculation
        when(mockModel.calculateBMI()).thenReturn(expectedBmi);
        when(mockModel.giveResultsBMI(expectedBmi)).thenReturn(expectedClassification);

        // Call the start method
        controller.start();

        // Verify interactions with mocked methods
        verify(mockView).askWeight();
        verify(mockView).askHeight();
        verify(mockView).showResults(expectedBmi, expectedClassification);
    }
}
