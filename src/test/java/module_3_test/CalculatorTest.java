package module_3_test;



import smartappdev.module_3.Calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {



        @Test
        void testAddition() {
            Calculator calculator = new Calculator();
            assertEquals(5, calculator.add(2, 3));
            assertEquals(-1, calculator.add(2, -3));
            assertEquals(0, calculator.add(0, 0));
        }

        @Test
        void testDivision() {
            Calculator calculator = new Calculator();
            assertEquals(2, calculator.divide(10, 5));
            assertEquals(-2, calculator.divide(10, -5));
        }

        @Test
        void testDivisionByZero() {
            Calculator calculator = new Calculator();
            IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));
            assertEquals("Cannot divide by zero", exception.getMessage());
        }

}
