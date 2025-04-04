package lab7;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NewIntCalculatorTest {
    private NewIntCalculator calculator;

    public NewIntCalculatorTest() {
    }

    @BeforeEach
    public void setup() {
        this.calculator = new NewIntCalculator(0);
    }

    @Test
    public void testAddPositive() {
        int value = 10;
        this.calculator.add(value);
        Assertions.assertEquals(10, calculator.result());
    }

    @Test
    public void testAddNegatives() {
        int value = -5;
        this.calculator.add(value);
        Assertions.assertEquals(-5, calculator.result());
    }

    @Test
    public void testSubtractPositives() {
        this.calculator = new NewIntCalculator(10);
        int value = 3;
        this.calculator.subtract(value);
        Assertions.assertEquals(7, calculator.result());
    }

    @Test
    public void testSubtractNegatives() {
        this.calculator = new NewIntCalculator(5);
        int value = -2;
        this.calculator.subtract(value);
        Assertions.assertEquals(7, calculator.result());
    }

    @Test
    public void testMultiplyPositives() {
        this.calculator = new NewIntCalculator(4);
        int value = 5;
        this.calculator.multiply(value);
        Assertions.assertEquals(20, calculator.result());
    }

    @Test
    public void testMultiplyNegatives() {
        this.calculator = new NewIntCalculator(8);
        int value = -5;
        this.calculator.multiply(value);
        Assertions.assertEquals(-40, calculator.result());
    }

    @Test
    public void testMultiplyBy0() {
        this.calculator = new NewIntCalculator(8);
        int value = 0;
        this.calculator.multiply(value);
        Assertions.assertEquals(0, calculator.result());
    }

    @Test
    public void testDividePositives() {
        this.calculator = new NewIntCalculator(8);
        int value = 2;
        this.calculator.divide(value);
        Assertions.assertEquals(4, calculator.result());
    }

    @Test
    public void testDivideNegatives() {
        this.calculator = new NewIntCalculator(8);
        int value = -2;
        this.calculator.divide(value);
        Assertions.assertEquals(-4, calculator.result());
    }

    @Test
    public void testDivideBy0(){
        this.calculator = new NewIntCalculator(8);
        int value = 0;
        ArithmeticException exception = Assertions.assertThrows(ArithmeticException.class, () -> {calculator.divide(value);});
        Assertions.assertEquals("/ by zero", exception.getMessage());
    }
    @AfterEach
    public void tearDown() {
        this.calculator = null;
    }
}
