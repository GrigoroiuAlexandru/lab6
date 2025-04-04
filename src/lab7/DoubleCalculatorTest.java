package lab7;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DoubleCalculatorTest {
    private DoubleCalculator calculator;

    public DoubleCalculatorTest() {
    }

    @BeforeEach
    public void setup() {
        this.calculator = new DoubleCalculator((double)0.0F);
    }

    @Test
    public void testAddPositive() {
        int value = 10;
        this.calculator.add((double)value);
        Assertions.assertEquals((double)10.0F, calculator.result());
    }

    @Test
    public void testAddNegatives() {
        int value = -5;
        this.calculator.add((double)value);
        Assertions.assertEquals((double)-5.0F, calculator.result());
    }

    @Test
    public void testSubtractPositives() {
        this.calculator = new DoubleCalculator((double)10.0F);
        int value = 3;
        this.calculator.subtract((double)value);
        Assertions.assertEquals((double)7.0F, calculator.result());
    }

    @Test
    public void testSubtractNegatives() {
        this.calculator = new DoubleCalculator((double)5.0F);
        int value = -2;
        this.calculator.subtract((double)value);
        Assertions.assertEquals((double)7.0F, calculator.result());
    }

    @Test
    public void testMultiplyPositives() {
        this.calculator = new DoubleCalculator((double)4.0F);
        int value = 5;
        this.calculator.multiply((double)value);
        Assertions.assertEquals((double)20.0F, calculator.result());
    }

    @Test
    public void testMultiplyNegatives() {
        this.calculator = new DoubleCalculator((double)8.0F);
        int value = -5;
        this.calculator.multiply((double)value);
        Assertions.assertEquals((double)-40.0F, calculator.result());
    }

    @Test
    public void testMultiplyBy0() {
        this.calculator = new DoubleCalculator((double)8.0F);
        int value = 0;
        this.calculator.multiply((double)value);
        Assertions.assertEquals((double)0F, calculator.result());
    }

    @Test
    public void testDividePositives() {
        this.calculator = new DoubleCalculator((double)8.0F);
        int value = 2;
        this.calculator.divide((double)value);
        Assertions.assertEquals((double)4.0F, calculator.result());
    }

    @Test
    public void testDivideNegatives() {
        this.calculator = new DoubleCalculator((double)8.0F);
        int value = -2;
        this.calculator.divide((double)value);
        Assertions.assertEquals((double)-4.0F, calculator.result());
    }

    @Test
    public void testDivideBy0(){
        this.calculator = new DoubleCalculator((double)8.0F);
        double value = 0.0;
        this.calculator.divide(value);
        Assertions.assertEquals(Double.POSITIVE_INFINITY, calculator.result());
    }
    @AfterEach
    public void tearDown() {

        this.calculator = null;
    }
}

